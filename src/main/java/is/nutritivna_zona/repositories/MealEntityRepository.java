package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MealEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealEntityRepository extends JpaRepository<MealEntity, Integer> {
    MealEntity findByNameAndDescription(String name, String description);
    MealEntity findByName(String name);
    List<MealEntity> findAllByIsVisible(boolean isVisible);
}
