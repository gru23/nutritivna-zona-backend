package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MenuTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuTypeEntityRepository extends JpaRepository<MenuTypeEntity, Integer> {
    MenuTypeEntity findByName(String name);
    List<MenuTypeEntity> findAllByIsVisible(boolean isVisible);
}
