package is.nutritivna_zona.services;

import is.nutritivna_zona.models.MealSymptoms;
import is.nutritivna_zona.models.dto.Symptom;

import java.util.List;
import java.util.Set;

public interface MealInFoodDiaryHasSymptomService {
    Set<MealSymptoms> findAll();
    void insert(Integer mealInFoodDiaryId, Integer symptomId);
    List<Symptom> insert(List<Integer> symptoms, Integer mealInFoodDiaryId);
    List<Symptom> update(List<Integer> symptoms, Integer mealInFoodDiaryId);
}
