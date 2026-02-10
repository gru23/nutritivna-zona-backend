package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Menu;
import is.nutritivna_zona.models.requests.MenuWithMealsRequest;

import java.util.List;

public interface MenuService extends CrudService<Integer> {
    List<Menu> getAllByUserId(Integer userId);
    Menu insert(MenuWithMealsRequest menuRequest);
    Menu update(Integer id, MenuWithMealsRequest menuRequest);
    void delete(Integer id) throws NotFoundException;
}
