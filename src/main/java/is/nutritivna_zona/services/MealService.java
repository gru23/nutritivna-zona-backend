package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Meal;
import is.nutritivna_zona.models.requests.MealRequest;

import java.util.List;

public interface MealService extends CrudService<Integer> {
    List<Meal> findAll();
    Meal insert(MealRequest mealRequest);
    Meal insertForEndpoint(MealRequest mealRequest) throws DuplicateValueException;
    Meal update(Integer id, MealRequest request) throws NotFoundException;
    void delete(Integer id);
}
