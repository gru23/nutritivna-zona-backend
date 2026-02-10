package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MenuEntityRepository extends JpaRepository<MenuEntity, Integer> {
    List<MenuEntity> getAllByUser_Id(Integer userId);
}
