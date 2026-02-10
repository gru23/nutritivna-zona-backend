package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Meal;
import is.nutritivna_zona.models.entities.MealEntity;
import is.nutritivna_zona.models.requests.MealRequest;
import is.nutritivna_zona.repositories.MealEntityRepository;
import is.nutritivna_zona.services.MealService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MealServiceImpl extends CrudJpaService<MealEntity, Integer> implements MealService {
    private final ModelMapper modelMapper;
    private final MealEntityRepository mealEntityRepository;

    public MealServiceImpl(ModelMapper modelMapper, MealEntityRepository mealEntityRepository) {
        super(mealEntityRepository, modelMapper, MealEntity.class);
        this.modelMapper = modelMapper;
        this.mealEntityRepository = mealEntityRepository;
    }

    @Override
    public List<Meal> findAll() {
        return mealEntityRepository.findAllByIsVisible(true)
                .stream()
                .map(m -> modelMapper.map(m, Meal.class))
                .collect(Collectors.toList());
    }

    @Override
    public Meal insert(MealRequest mealRequest) {
        MealEntity mealEntity = mealEntityRepository.findByName(mealRequest.getName());
        if(mealEntity != null) {
            mealRequest.setIsVisible(true);
            return update(mealEntity.getId(), mealRequest, Meal.class);
            //return modelMapper.map(mealEntity, Meal.class);
        }
        return insert(mealRequest, Meal.class);
    }


    @Override
    public Meal insertForEndpoint(MealRequest mealRequest) {
        MealEntity entity = mealEntityRepository.findByName(mealRequest.getName());
        if(entity != null) {
            entity.setDescription(mealRequest.getDescription());
            if(!entity.getIsVisible()) {
                entity.setIsVisible(true);
                return update(entity.getId(), entity, Meal.class);
            }
            else
                throw new DuplicateValueException();
        }
        return insert(mealRequest, Meal.class);
    }

    @Override
    public Meal update(Integer id, MealRequest request) throws NotFoundException {
        if(!mealEntityRepository.existsById(id))
            throw new NotFoundException();
        MealEntity entity = mealEntityRepository.findByName(request.getName());
        if(entity == null) {
            request.setIsVisible(true);
            return insert(request, Meal.class);
        }
        return update(entity.getId(), request, Meal.class);
    }

    @Override
    public void delete(Integer id) {
        MealEntity entity = mealEntityRepository.findById(id).orElseThrow(NotFoundException::new);
        entity.setIsVisible(false);
        update(id, entity, Meal.class);
    }
}
