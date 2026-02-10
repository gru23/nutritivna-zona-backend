package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.models.dto.MealInMenu;
import is.nutritivna_zona.models.entities.MealInMenuEntity;
import is.nutritivna_zona.models.requests.MealInMenuRequest;

import java.util.List;

public interface MealInMenuService extends CrudService<Integer> {
    List<MealInMenu> insertMealsInMenu(List<MealInMenuRequest> mealsInMenuRequest, Integer menuId);
    List<MealInMenu> updateMealInMenu(List<MealInMenuRequest> mealsInMenuRequest, Integer menuId);
    void delete(MealInMenuEntity mealInMenu);
}
