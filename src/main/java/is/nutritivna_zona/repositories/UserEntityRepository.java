package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername(String username);
    Boolean existsByUsername(String username);

    Optional<UserEntity> findUserByUsername(String username);
}
