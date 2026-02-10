package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.models.dto.JwtUser;
import is.nutritivna_zona.repositories.UserEntityRepository;
import is.nutritivna_zona.services.JwtUserDetailsService;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JwtUserDetailsServiceImpl implements JwtUserDetailsService {

    private final UserEntityRepository repository;
    private final ModelMapper modelMapper;

    public JwtUserDetailsServiceImpl(UserEntityRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    @Override
    public JwtUser loadUserByUsername(String username) throws UsernameNotFoundException {

        return modelMapper.map(repository.findUserByUsername(username).
                orElseThrow(() -> new UsernameNotFoundException(username)), JwtUser.class);
    }
}