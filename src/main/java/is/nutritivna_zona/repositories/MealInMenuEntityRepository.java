package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MealInMenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealInMenuEntityRepository extends JpaRepository<MealInMenuEntity, Integer> {
    List<MealInMenuEntity> findAllByMeal_Id(Integer mealId);
}
