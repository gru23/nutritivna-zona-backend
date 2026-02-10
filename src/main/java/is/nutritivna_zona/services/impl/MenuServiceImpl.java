package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Menu;
import is.nutritivna_zona.models.entities.MealInMenuEntity;
import is.nutritivna_zona.models.entities.MenuEntity;
import is.nutritivna_zona.models.requests.MenuRequest;
import is.nutritivna_zona.models.requests.MenuWithMealsRequest;
import is.nutritivna_zona.repositories.MenuEntityRepository;
import is.nutritivna_zona.services.MealInMenuService;
import is.nutritivna_zona.services.MenuService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MenuServiceImpl extends CrudJpaService<MenuEntity, Integer> implements MenuService {
    private final ModelMapper modelMapper;
    private final MealInMenuService mealInMenuService;
    private final MenuEntityRepository menuEntityRepository;

    public MenuServiceImpl(MenuEntityRepository menuEntityRepository, ModelMapper modelMapper, MealInMenuService mealInMenuService) {
        super(menuEntityRepository, modelMapper, MenuEntity.class);
        this.menuEntityRepository = menuEntityRepository;
        this.modelMapper = modelMapper;
        this.mealInMenuService = mealInMenuService;
    }

    @Override
    public List<Menu> getAllByUserId(Integer userId) {
        return menuEntityRepository.getAllByUser_Id(userId)
                .stream()
                .map(m -> modelMapper.map(m, Menu.class))
                .collect(Collectors.toList());
    }

    @Override
    public Menu insert(MenuWithMealsRequest menuRequest) {
        MenuRequest menu = modelMapper.map(menuRequest, MenuRequest.class);
        Menu result = insert(menu, Menu.class);
        result.setMealsInMenu(mealInMenuService.insertMealsInMenu(menuRequest.getMealsInMenu(), result.getId()));
        return result;
    }

    @Override
    public Menu update(Integer id, MenuWithMealsRequest menuRequest) {
        MenuRequest request = modelMapper.map(menuRequest, MenuRequest.class);
        Menu menu = update(id, request, Menu.class);
        menu.setMealsInMenu(mealInMenuService.updateMealInMenu(menuRequest.getMealsInMenu(), id));
        return menu;
    }

    @Override
    public void delete(Integer id) throws NotFoundException {
        MenuEntity entity = menuEntityRepository.findById(id).orElseThrow(NotFoundException::new);
        for(MealInMenuEntity m : entity.getMealsInMenu())
            mealInMenuService.delete(m);
        super.delete(id);
    }
}
