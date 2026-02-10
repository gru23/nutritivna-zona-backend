package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.models.dto.MealType;
import is.nutritivna_zona.models.requests.MealTypeRequest;

import java.util.List;

public interface MealTypeService extends CrudService<Integer> {
    List<MealType> findAll();
    MealType insert(MealTypeRequest symptomRequest) throws DuplicateValueException;
    void delete(Integer id);
}
