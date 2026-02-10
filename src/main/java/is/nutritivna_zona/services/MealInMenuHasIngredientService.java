package is.nutritivna_zona.services;

import is.nutritivna_zona.models.dto.Ingredient;

import java.util.List;

public interface MealInMenuHasIngredientService {
    List<Ingredient> findMealsIngredients(String mealName);
    void insert(Integer mealInMenuId, Integer ingredientId);
}
