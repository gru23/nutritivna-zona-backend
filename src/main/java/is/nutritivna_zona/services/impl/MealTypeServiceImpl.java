package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.models.dto.MealType;
import is.nutritivna_zona.models.entities.MealTypeEntity;
import is.nutritivna_zona.models.requests.MealTypeRequest;
import is.nutritivna_zona.repositories.MealTypeEntityRepository;
import is.nutritivna_zona.services.MealTypeService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MealTypeServiceImpl extends CrudJpaService<MealTypeEntity, Integer> implements MealTypeService {
    private final ModelMapper modelMapper;
    private final MealTypeEntityRepository mealTypeEntityRepository;

    public MealTypeServiceImpl(ModelMapper modelMapper, MealTypeEntityRepository mealTypeEntityRepository) {
        super(mealTypeEntityRepository, modelMapper, MealTypeEntity.class);
        this.modelMapper = modelMapper;
        this.mealTypeEntityRepository = mealTypeEntityRepository;
    }

    @Override
    public List<MealType> findAll() {
        return mealTypeEntityRepository.findAllByIsVisibleOrderByOrdinalAsc(true)
                .stream()
                .map(m -> modelMapper.map(m, MealType.class))
                .collect(Collectors.toList());
    }

    @Override
    public MealType insert(MealTypeRequest mealTypeRequest) throws DuplicateValueException {
        MealTypeEntity entity = mealTypeEntityRepository.findByName(mealTypeRequest.getName());
        if(entity != null) {
            if(entity.getIsVisible() && entity.getOrdinal().equals(mealTypeRequest.getOrdinal()))
                throw new DuplicateValueException();
            else if (!entity.getIsVisible()) {
                if(!entity.getOrdinal().equals(mealTypeRequest.getOrdinal())) {
                    mealTypeEntityRepository.shiftOrdinalsUpFrom(mealTypeRequest.getOrdinal());
                    entity.setOrdinal(mealTypeRequest.getOrdinal());
                }
                entity.setIsVisible(true);
                return update(entity.getId(), entity, MealType.class);
            }
            else {
                mealTypeEntityRepository.shiftOrdinalsUpFrom(mealTypeRequest.getOrdinal());
                entity.setOrdinal(mealTypeRequest.getOrdinal());
                return update(entity.getId(), entity, MealType.class);
            }
        }
        mealTypeEntityRepository.shiftOrdinalsUpFrom(mealTypeRequest.getOrdinal());
        return super.insert(mealTypeRequest, MealType.class);
    }

    @Override
    public void delete(Integer id) {
        MealTypeEntity entity = mealTypeEntityRepository.findById(id).get();
        entity.setIsVisible(false);
        update(id, entity, MealType.class);
    }
}
