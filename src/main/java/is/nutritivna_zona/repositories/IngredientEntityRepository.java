package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.IngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientEntityRepository extends JpaRepository<IngredientEntity, Integer> {
    IngredientEntity findByName(String name);
    List<IngredientEntity> findAllByIsVisible(boolean isVisible);
}
