package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.models.MealSymptoms;
import is.nutritivna_zona.models.dto.Symptom;
import is.nutritivna_zona.models.entities.MealInFoodDiaryHasSymptomEntity;
import is.nutritivna_zona.models.entities.MealInFoodDiaryHasSymptomEntityId;
import is.nutritivna_zona.models.entities.SymptomEntity;
import is.nutritivna_zona.repositories.MealInFoodDiaryEntityRepository;
import is.nutritivna_zona.repositories.MealInFoodDiaryHasSymptomEntityRepository;
import is.nutritivna_zona.repositories.SymptomEntityRepository;
import is.nutritivna_zona.services.MealInFoodDiaryHasSymptomService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MealInFoodDiaryHasSymptomServiceImpl implements MealInFoodDiaryHasSymptomService {
    private final ModelMapper modelMapper;
    private final MealInFoodDiaryHasSymptomEntityRepository entityRepository;
    private final MealInFoodDiaryEntityRepository mealInFoodDiaryEntityRepository;
    private final SymptomEntityRepository symptomEntityRepository;

    public MealInFoodDiaryHasSymptomServiceImpl(ModelMapper modelMapper, MealInFoodDiaryHasSymptomEntityRepository entityRepository, MealInFoodDiaryEntityRepository mealInFoodDiaryEntityRepository, SymptomEntityRepository symptomEntityRepository) {
        this.modelMapper = modelMapper;
        this.entityRepository = entityRepository;
        this.mealInFoodDiaryEntityRepository = mealInFoodDiaryEntityRepository;
        this.symptomEntityRepository = symptomEntityRepository;
    }

    @Override
    public Set<MealSymptoms> findAll() {
        return entityRepository.findAll().stream().map(m -> modelMapper.map(m, MealSymptoms.class)).collect(Collectors.toSet());
    }

    @Override
    public void insert(Integer mealInFoodDiaryId, Integer symptomId) {
        MealInFoodDiaryHasSymptomEntity entity =
                new MealInFoodDiaryHasSymptomEntity(
                        new MealInFoodDiaryHasSymptomEntityId(mealInFoodDiaryId, symptomId));
        entity.setMealInFoodDiary(mealInFoodDiaryEntityRepository.findById(mealInFoodDiaryId).get());
        entity.setSymptom(symptomEntityRepository.findById(symptomId).get());
        entityRepository.saveAndFlush(entity);
    }

    @Override
    public List<Symptom> insert(List<Integer> symptoms, Integer mealInFoodDiaryId) {
        List<Symptom> result = new LinkedList<>();
        for(Integer i : symptoms) {
            SymptomEntity entity = symptomEntityRepository.findById(i).get();
            result.add(modelMapper.map(entity, Symptom.class));
            MealInFoodDiaryHasSymptomEntity temp = new MealInFoodDiaryHasSymptomEntity(
                            new MealInFoodDiaryHasSymptomEntityId(mealInFoodDiaryId, entity.getId()));
            temp.setMealInFoodDiary(mealInFoodDiaryEntityRepository.findById(mealInFoodDiaryId).get());
            temp.setSymptom(entity);
            entityRepository.saveAndFlush(temp);
        }
        return result;
    }

    @Override
    public List<Symptom> update(List<Integer> symptoms, Integer mealInFoodDiaryId) {
        entityRepository.removeAllByMealInFoodDiary_Id(mealInFoodDiaryId);
        return insert(symptoms,mealInFoodDiaryId);
    }
}
