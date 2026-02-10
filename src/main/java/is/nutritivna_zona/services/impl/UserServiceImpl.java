package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.User;
import is.nutritivna_zona.models.entities.UserEntity;
import is.nutritivna_zona.models.requests.DiaryAvailableRequest;
import is.nutritivna_zona.models.requests.UserRequest;
import is.nutritivna_zona.repositories.UserEntityRepository;
import is.nutritivna_zona.services.EmailService;
import is.nutritivna_zona.services.MenuService;
import is.nutritivna_zona.services.UserService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl extends CrudJpaService<UserEntity, Integer> implements UserService {
    private final PasswordEncoder passwordEncoder;
    private final EmailService emailService;
    private final UserEntityRepository userRepository;
    private final MenuService menuService;

    public UserServiceImpl(ModelMapper modelMapper, PasswordEncoder passwordEncoder, EmailService emailService,
                           UserEntityRepository userRepository, MenuService menuService) {
        super(userRepository, modelMapper, UserEntity.class);
        this.passwordEncoder = passwordEncoder;
        this.emailService = emailService;
        this.userRepository = userRepository;
        this.menuService = menuService;
    }

    @Override
    public User update(Integer id, UserRequest userRequest) throws NotFoundException {
        boolean isActivationStatusChanged = activationStatusIsChanged(id, userRequest);
        userRequest.setPassword(updatePassword(id, userRequest));
        User result = update(id, userRequest, User.class);
        if (isActivationStatusChanged) {
            if (result.getIsActivated())
                emailService.activatedAccountEmail(result.getEmail());
            else
                emailService.deactivatedAccountEmail(result.getEmail());
        }
        return result;
    }

    @Override
    public void delete(Integer id) {
        UserEntity entity = userRepository.findById(id).get();
        entity.getMenus().forEach(m -> menuService.delete(m.getId()));
        super.delete(id);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserEntity> optionalUser = Optional.ofNullable(userRepository.findByUsername(username));
        if (!optionalUser.isPresent())
            throw new UsernameNotFoundException("Korisnik nije pronađen: " + username);
        UserEntity user = optionalUser.get();
        if (!user.getIsActivated())
            throw new UsernameNotFoundException("Korisnik nije aktiviran: " + username);
        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .roles(user.getRole().name())
                .disabled(!user.getIsActivated())
                .build();
    }

    @Override
    public void signUp(UserRequest userRequest) {
        if (userRepository.existsByUsername(userRequest.getUsername()))
            throw new DuplicateValueException();
        UserEntity entity = getModelMapper().map(userRequest, UserEntity.class);
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        entity.setRole(userRequest.getRole());
        insert(entity, UserEntity.class);
        emailService.sendConfirmationAccountEmail(entity.getEmail(), entity.getId());
    }

    @Override
    public void setIsNewDiaryAvailable(DiaryAvailableRequest diaryAvailableRequest) {
        UserEntity entity = userRepository.findById(diaryAvailableRequest.getUserId())
                .orElseThrow(NotFoundException::new);
        entity.setIsNewDiaryAvailable(diaryAvailableRequest.getIsDiaryAvailable());
        userRepository.saveAndFlush(entity);
    }

    @Override
    public Boolean setProfileIsConfirmed(String encodedId) {
        Integer id = Integer.valueOf(new String(Base64.getUrlDecoder().decode(encodedId)));
        Optional<UserEntity> entity = userRepository.findById(id);
        if(entity.isEmpty() || entity.get().getIsProfileConfirmed()) return false;
        entity.get().setIsProfileConfirmed(true);
        userRepository.saveAndFlush(entity.get());
        return true;
    }

    private String updatePassword(Integer userId, UserRequest userRequest) {
        UserEntity entity = userRepository.findById(userId).get();
        if(userRequest.getPassword().isBlank())
            return entity.getPassword();
        return passwordEncoder.encode(userRequest.getPassword());
    }

    private boolean activationStatusIsChanged(Integer id, UserRequest userRequest) throws NotFoundException {
        UserEntity user = userRepository.findById(id).orElseThrow(NotFoundException::new);
        return user.getIsActivated() != userRequest.getIsActivated();
    }
}
