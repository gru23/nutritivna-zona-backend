package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Meal;
import is.nutritivna_zona.models.dto.MealInMenu;
import is.nutritivna_zona.models.entities.MealInMenuEntity;
import is.nutritivna_zona.models.entities.MenuEntity;
import is.nutritivna_zona.models.requests.MealInMenuOnlyIdsRequest;
import is.nutritivna_zona.models.requests.MealInMenuRequest;
import is.nutritivna_zona.models.requests.MealRequest;
import is.nutritivna_zona.repositories.MealInMenuEntityRepository;
import is.nutritivna_zona.repositories.MenuEntityRepository;
import is.nutritivna_zona.services.IngredientQuantityService;
import is.nutritivna_zona.services.MealInMenuService;
import is.nutritivna_zona.services.MealService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class MealInMenuServiceImpl extends CrudJpaService<MealInMenuEntity, Integer> implements MealInMenuService {
    private final ModelMapper modelMapper;
    private final MealService mealService;
    private final IngredientQuantityService ingredientQuantityService;
    private final MealInMenuEntityRepository mealInMenuEntityRepository;
    private final MenuEntityRepository menuEntityRepository;

    public MealInMenuServiceImpl(MealInMenuEntityRepository mealInMenuEntityRepository, ModelMapper modelMapper, MealService mealService,
                                 IngredientQuantityService ingredientQuantityService, MenuEntityRepository menuEntityRepository) {
        super(mealInMenuEntityRepository, modelMapper, MealInMenuEntity.class);
        this.modelMapper = modelMapper;
        this.mealService = mealService;
        this.ingredientQuantityService = ingredientQuantityService;
        this.mealInMenuEntityRepository = mealInMenuEntityRepository;
        this.menuEntityRepository = menuEntityRepository;
    }

    @Override
    public List<MealInMenu> insertMealsInMenu(List<MealInMenuRequest> mealInMenuRequest, Integer menuId) {
        List<MealInMenu> result = new LinkedList<>();
        for(MealInMenuRequest m : mealInMenuRequest) {
            Meal meal = mealService.insert(modelMapper.map(m, MealRequest.class));
            MealInMenuOnlyIdsRequest tempRequest = new MealInMenuOnlyIdsRequest(meal.getId(), menuId, m.getMealTypeId());
            MealInMenu temp = insert(tempRequest, MealInMenu.class);
            temp.setIngredientQuantities(ingredientQuantityService.insertIngredientQuantity(m.getIngredients(), temp.getId()));
            result.add(temp);
        }
        return result;
    }

    @Override
    public List<MealInMenu> updateMealInMenu(List<MealInMenuRequest> mealsInMenuRequest, Integer menuId) {
        MenuEntity menuEntity = menuEntityRepository.findById(menuId).orElseThrow(NotFoundException::new);
        mealInMenuEntityRepository.deleteAll(menuEntity.getMealsInMenu());
        return insertMealsInMenu(mealsInMenuRequest, menuId);
    }

    @Override
    public void delete(MealInMenuEntity mealInMenu) {
        mealInMenuEntityRepository.delete(mealInMenu);
    }
}
