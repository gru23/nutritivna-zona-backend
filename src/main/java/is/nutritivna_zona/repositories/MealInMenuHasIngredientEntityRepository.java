package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MealInMenuHasIngredientEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MealInMenuHasIngredientEntityRepository extends JpaRepository<MealInMenuHasIngredientEntity, Integer> {
    List<MealInMenuHasIngredientEntity> findAllByMealInMenu_Id(Integer mealInMenuId);
}
