package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.FoodDiary;
import is.nutritivna_zona.models.entities.FoodDiaryEntity;
import is.nutritivna_zona.models.requests.DiarySubmitionRequest;
import is.nutritivna_zona.models.requests.FoodDiaryRequest;
import is.nutritivna_zona.models.requests.FoodDiaryWithMealsRequest;
import is.nutritivna_zona.repositories.FoodDiaryEntityRepository;
import is.nutritivna_zona.repositories.UserEntityRepository;
import is.nutritivna_zona.services.FoodDiaryService;
import is.nutritivna_zona.services.MealInFoodDiaryService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class FoodDiaryServiceImpl extends CrudJpaService<FoodDiaryEntity, Integer> implements FoodDiaryService {
    private final ModelMapper modelMapper;
    private final MealInFoodDiaryService mealInFoodDiaryService;
    private final FoodDiaryEntityRepository foodDiaryEntityRepository;
    private final UserEntityRepository userEntityRepository;

    public FoodDiaryServiceImpl(ModelMapper modelMapper, MealInFoodDiaryService mealInFoodDiaryService, FoodDiaryEntityRepository foodDiaryEntityRepository, UserEntityRepository userEntityRepository) {
        super(foodDiaryEntityRepository, modelMapper, FoodDiaryEntity.class);
        this.modelMapper = modelMapper;
        this.mealInFoodDiaryService = mealInFoodDiaryService;
        this.foodDiaryEntityRepository = foodDiaryEntityRepository;
        this.userEntityRepository = userEntityRepository;
    }

    @Override
    public List<FoodDiary> getAllDiariesByUserId(Integer id) throws NotFoundException {
        if(!userEntityRepository.existsById(id))
            throw new NotFoundException();
        return foodDiaryEntityRepository.getAllByUser_Id(id)
                .stream()
                .map(fd -> modelMapper.map(fd, FoodDiary.class))
                .collect(Collectors.toList());
    }

    @Override
    public FoodDiary create(FoodDiaryRequest foodDiaryRequest) {
        return insert(foodDiaryRequest, FoodDiary.class);
    }

    @Override
    public FoodDiary insert(FoodDiaryWithMealsRequest diaryRequest) {
        FoodDiaryRequest diary = modelMapper.map(diaryRequest, FoodDiaryRequest.class);
        FoodDiary result = insert(diary, FoodDiary.class);
        result.setMealInFoodDiaries(mealInFoodDiaryService.insertMealsInFoodDiary(diaryRequest.getMeals(), result.getId()));
        return result;
    }

    @Override
    public void setIsSubmitted(DiarySubmitionRequest request) {
        FoodDiaryEntity entity = foodDiaryEntityRepository.findById(request.getId())
                .orElseThrow(NotFoundException::new);
        entity.setIsSubmitted(request.getIsSubmitted());
        foodDiaryEntityRepository.saveAndFlush(entity);
    }
}
