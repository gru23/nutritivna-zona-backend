package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.models.dto.Symptom;
import is.nutritivna_zona.models.requests.SymptomRequest;

import java.util.List;

public interface SymptomService extends CrudService<Integer> {
    List<Symptom> findAll();
    Symptom insert(SymptomRequest symptomRequest) throws DuplicateValueException;
    void delete(Integer id);
}
