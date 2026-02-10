package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.models.dto.Ingredient;
import is.nutritivna_zona.models.entities.MealEntity;
import is.nutritivna_zona.models.entities.MealInMenuEntity;
import is.nutritivna_zona.models.entities.MealInMenuHasIngredientEntity;
import is.nutritivna_zona.models.entities.MealInMenuHasIngredientEntityId;
import is.nutritivna_zona.repositories.IngredientEntityRepository;
import is.nutritivna_zona.repositories.MealEntityRepository;
import is.nutritivna_zona.repositories.MealInMenuEntityRepository;
import is.nutritivna_zona.repositories.MealInMenuHasIngredientEntityRepository;
import is.nutritivna_zona.services.MealInMenuHasIngredientService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class MealInMenuHasIngredientServiceImpl implements MealInMenuHasIngredientService {
    private final ModelMapper modelMapper;
    private final MealInMenuHasIngredientEntityRepository mealInMenuHasIngredientEntityRepository;
    private final MealInMenuEntityRepository mealInMenuEntityRepository;
    private final IngredientEntityRepository ingredientEntityRepository;
    private final MealEntityRepository mealEntityRepository;

    public MealInMenuHasIngredientServiceImpl(MealInMenuHasIngredientEntityRepository mealInMenuHasIngredientEntityRepository,
                                              MealInMenuEntityRepository mealInMenuEntityRepository,
                                              IngredientEntityRepository ingredientEntityRepository, MealEntityRepository mealEntityRepository,
                                              ModelMapper modelMapper) {
        this.mealInMenuHasIngredientEntityRepository = mealInMenuHasIngredientEntityRepository;
        this.mealInMenuEntityRepository = mealInMenuEntityRepository;
        this.ingredientEntityRepository = ingredientEntityRepository;
        this.mealEntityRepository = mealEntityRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Ingredient> findMealsIngredients(String mealName) {
        MealEntity meal = mealEntityRepository.findByName(mealName);
        if(meal == null)
            return null;
        List<Integer> mealInMenuIds = mealInMenuEntityRepository.findAllByMeal_Id(meal.getId())
                .stream()
                .map(MealInMenuEntity::getId)
                .toList();
        List<Integer> ingredientIds = new ArrayList<>();
        for (Integer id : mealInMenuIds)
            mealInMenuHasIngredientEntityRepository.findAllByMealInMenu_Id(id)
                    .forEach(i -> ingredientIds.add(i.getIngredient().getId()));
        List<Ingredient> result = new LinkedList<>();
        ingredientIds.forEach(id -> result.add(modelMapper.map(ingredientEntityRepository.findById(id).get(), Ingredient.class)));
        return result.stream().distinct().toList();
    }

    @Override
    public void insert(Integer mealInMenuId, Integer ingredientId) {
        MealInMenuHasIngredientEntityId mealInMenuHasIngredientEntityId =
                new MealInMenuHasIngredientEntityId(mealInMenuId, ingredientId);
        MealInMenuHasIngredientEntity mealInMenuHasIngredientEntity =
                new MealInMenuHasIngredientEntity(mealInMenuHasIngredientEntityId);
        mealInMenuHasIngredientEntity.setIngredient(ingredientEntityRepository.findById(ingredientId).get());
        mealInMenuHasIngredientEntity.setMealInMenu(mealInMenuEntityRepository.findById(mealInMenuId).get());
        mealInMenuHasIngredientEntityRepository.saveAndFlush(mealInMenuHasIngredientEntity);
    }
}
