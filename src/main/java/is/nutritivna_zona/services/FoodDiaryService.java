package is.nutritivna_zona.services;

import is.nutritivna_zona.base.CrudService;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.FoodDiary;
import is.nutritivna_zona.models.requests.DiarySubmitionRequest;
import is.nutritivna_zona.models.requests.FoodDiaryRequest;
import is.nutritivna_zona.models.requests.FoodDiaryWithMealsRequest;

import java.util.List;


public interface FoodDiaryService extends CrudService<Integer> {
    List<FoodDiary> getAllDiariesByUserId(Integer id) throws NotFoundException;
    FoodDiary create(FoodDiaryRequest foodDiaryRequest);
    FoodDiary insert(FoodDiaryWithMealsRequest diaryRequest);
    void setIsSubmitted(DiarySubmitionRequest request);
}
