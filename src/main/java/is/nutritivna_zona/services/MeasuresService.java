package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Measures;

import java.time.LocalDate;
import java.util.List;

public interface MeasuresService extends CrudService<Integer> {
    List<Measures> findAllMeasuresByUserId(Integer userId);
    Measures findMeasureByDateAndUserId(LocalDate date, Integer userId) throws NotFoundException;
}
