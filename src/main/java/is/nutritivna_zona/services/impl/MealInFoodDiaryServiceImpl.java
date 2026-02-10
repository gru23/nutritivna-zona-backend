package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.models.MealInFoodDiary;
import is.nutritivna_zona.models.dto.Symptom;
import is.nutritivna_zona.models.entities.MealInFoodDiaryEntity;
import is.nutritivna_zona.models.requests.MealInFoodDiaryRequest;
import is.nutritivna_zona.models.requests.MealInFoodDiaryWithSymptomsRequest;
import is.nutritivna_zona.repositories.MealInFoodDiaryEntityRepository;
import is.nutritivna_zona.repositories.SymptomEntityRepository;
import is.nutritivna_zona.services.MealInFoodDiaryHasSymptomService;
import is.nutritivna_zona.services.MealInFoodDiaryService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@Transactional
public class MealInFoodDiaryServiceImpl extends CrudJpaService<MealInFoodDiaryEntity, Integer> implements MealInFoodDiaryService {
    private final ModelMapper modelMapper;
    private final SymptomEntityRepository symptomEntityRepository;
    private final MealInFoodDiaryHasSymptomService mealInFoodDiaryHasSymptomService;

    public MealInFoodDiaryServiceImpl(MealInFoodDiaryEntityRepository mealInFoodDiaryEntityRepository, ModelMapper modelMapper, SymptomEntityRepository symptomEntityRepository, MealInFoodDiaryHasSymptomService mealInFoodDiaryHasSymptomService) {
        super(mealInFoodDiaryEntityRepository, modelMapper, MealInFoodDiaryEntity.class);
        this.modelMapper = modelMapper;
        this.symptomEntityRepository = symptomEntityRepository;
        this.mealInFoodDiaryHasSymptomService = mealInFoodDiaryHasSymptomService;
    }

    @Override
    public List<MealInFoodDiary> insertMealsInFoodDiary(List<MealInFoodDiaryWithSymptomsRequest> mealInFoodDiaryWithSymptomsRequest, Integer diaryId) {
        List<MealInFoodDiary> result = new LinkedList<>();
        for(MealInFoodDiaryWithSymptomsRequest m : mealInFoodDiaryWithSymptomsRequest) {
            MealInFoodDiaryRequest request = modelMapper.map(m, MealInFoodDiaryRequest.class);
            request.setFoodDiaryId(diaryId);
            MealInFoodDiary temp = insert(request, MealInFoodDiary.class);
            List<Symptom> symptoms = new LinkedList<>();
            for(Integer symptomId : m.getSymptoms()) {
                mealInFoodDiaryHasSymptomService.insert(temp.getId(), symptomId);
                symptoms.add(modelMapper.map(symptomEntityRepository.findById(symptomId).get(), Symptom.class));
            }
            temp.setSymptoms(symptoms);
            result.add(temp);
        }
        return result;
    }

    @Override
    public MealInFoodDiary insert(MealInFoodDiaryWithSymptomsRequest mealInFoodDiaryRequest) {
        MealInFoodDiary meal = super.insert(mealInFoodDiaryRequest, MealInFoodDiary.class);
        meal.setSymptoms(mealInFoodDiaryHasSymptomService
                .insert(mealInFoodDiaryRequest.getSymptoms(), meal.getId()));
        return meal;
    }

    @Override
    public MealInFoodDiary update(Integer mealInFoodDiaryId, MealInFoodDiaryWithSymptomsRequest mealInFoodDiaryRequest) {
        MealInFoodDiary meal = super.update(mealInFoodDiaryId, mealInFoodDiaryRequest, MealInFoodDiary.class);
        meal.setSymptoms(mealInFoodDiaryHasSymptomService.update(mealInFoodDiaryRequest.getSymptoms(), mealInFoodDiaryId));
        return meal;
    }
}
