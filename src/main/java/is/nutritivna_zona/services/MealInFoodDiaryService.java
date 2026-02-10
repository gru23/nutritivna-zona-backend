package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.models.MealInFoodDiary;
import is.nutritivna_zona.models.requests.MealInFoodDiaryWithSymptomsRequest;

import java.util.List;


public interface MealInFoodDiaryService extends CrudService<Integer> {
    List<MealInFoodDiary> insertMealsInFoodDiary(List<MealInFoodDiaryWithSymptomsRequest> mealInFoodDiaryWithSymptomsRequest, Integer menuId);
    MealInFoodDiary insert(MealInFoodDiaryWithSymptomsRequest mealInFoodDiaryRequest);
    MealInFoodDiary update(Integer mealInFoodDiaryId, MealInFoodDiaryWithSymptomsRequest mealInFoodDiaryRequest);
}
