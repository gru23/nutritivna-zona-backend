package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.models.dto.Ingredient;
import is.nutritivna_zona.models.requests.IngredientRequest;

import java.util.List;

public interface IngredientService extends CrudService<Integer> {
    List<Ingredient> findAll();
    Ingredient insert(IngredientRequest ingredientRequest);
    Ingredient insertForEndpoint(IngredientRequest ingredientRequest) throws DuplicateValueException;
    void delete(Integer id);
}
