package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.models.dto.IngredientQuantity;
import is.nutritivna_zona.models.requests.IngredientQuantityRequest;

import java.util.List;

public interface IngredientQuantityService extends CrudService<Integer> {
    List<IngredientQuantity> insertIngredientQuantity(List<IngredientQuantityRequest> ingredientQuantityRequest, Integer mealInMenuId);
}
