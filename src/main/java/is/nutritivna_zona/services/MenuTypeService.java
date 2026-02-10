package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.models.dto.MenuType;
import is.nutritivna_zona.models.requests.MenuTypeRequest;

import java.util.List;

public interface MenuTypeService extends CrudService<Integer> {
    List<MenuType> findAll();
    MenuType insert(MenuTypeRequest menuTypeRequest) throws DuplicateValueException;
    void delete(Integer id);
}
