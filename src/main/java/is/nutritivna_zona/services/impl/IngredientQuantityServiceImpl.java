package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.models.dto.Ingredient;
import is.nutritivna_zona.models.dto.IngredientQuantity;
import is.nutritivna_zona.models.entities.IngredientQuantityEntity;
import is.nutritivna_zona.models.requests.IngredientQuantityRequest;
import is.nutritivna_zona.models.requests.IngredientRequest;
import is.nutritivna_zona.repositories.IngredientQuantityEntityRepository;
import is.nutritivna_zona.services.IngredientQuantityService;
import is.nutritivna_zona.services.IngredientService;
import is.nutritivna_zona.services.MealInMenuHasIngredientService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class IngredientQuantityServiceImpl extends CrudJpaService<IngredientQuantityEntity, Integer> implements IngredientQuantityService {
    private final ModelMapper modelMapper;
    private final IngredientService ingredientService;
    private final MealInMenuHasIngredientService mealInMenuHasIngredientService;

    public IngredientQuantityServiceImpl(IngredientQuantityEntityRepository ingredientQuantityEntityRepository,
                                         ModelMapper modelMapper, IngredientService ingredientService,
                                         MealInMenuHasIngredientService mealInMenuHasIngredientService) {
        super(ingredientQuantityEntityRepository, modelMapper, IngredientQuantityEntity.class);
        this.modelMapper = modelMapper;
        this.ingredientService = ingredientService;
        this.mealInMenuHasIngredientService = mealInMenuHasIngredientService;
    }

    @Override
    public List<IngredientQuantity> insertIngredientQuantity(List<IngredientQuantityRequest> ingredientQuantityRequest, Integer mealInMenuId) {
        List<IngredientQuantity> result = new LinkedList<>();
        for(IngredientQuantityRequest i : ingredientQuantityRequest) {
            Ingredient ingredient = ingredientService.insert(modelMapper.map(i, IngredientRequest.class));
            IngredientQuantity ingredientQuantity = modelMapper.map(i, IngredientQuantity.class);
            ingredientQuantity.setIngredientId(ingredient.getId());
            ingredientQuantity.setMealInMenuId(mealInMenuId);
            result.add(insert(ingredientQuantity, IngredientQuantity.class));
            mealInMenuHasIngredientService.insert(mealInMenuId, ingredient.getId());
        }
        return result;
    }
}
