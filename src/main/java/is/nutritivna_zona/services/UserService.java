package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.User;
import is.nutritivna_zona.models.requests.DiaryAvailableRequest;
import is.nutritivna_zona.models.requests.UserRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserService extends CrudService<Integer> {
//    List<User> findAll();
//    User findById(Integer id) throws NotFoundException;
//
//    void delete(Integer id);
//    User insert(UserRequest userRequest) throws NotFoundException;
//    User update(Integer id, UserRequest userRequest) throws NotFoundException;

    User update(Integer id, UserRequest userRequest) throws NotFoundException;
    void delete(Integer id) throws NotFoundException;

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    void signUp(UserRequest userRequest);

    void setIsNewDiaryAvailable(DiaryAvailableRequest diaryAvailableRequest);
    Boolean setProfileIsConfirmed(String encodedId);
}
