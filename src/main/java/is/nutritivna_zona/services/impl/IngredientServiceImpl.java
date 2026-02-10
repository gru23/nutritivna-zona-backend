package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Ingredient;
import is.nutritivna_zona.models.entities.IngredientEntity;
import is.nutritivna_zona.models.requests.IngredientRequest;
import is.nutritivna_zona.repositories.IngredientEntityRepository;
import is.nutritivna_zona.services.IngredientService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class IngredientServiceImpl extends CrudJpaService<IngredientEntity, Integer> implements IngredientService {
    private final ModelMapper modelMapper;
    private final IngredientEntityRepository ingredientEntityRepository;

    public IngredientServiceImpl(IngredientEntityRepository ingredientEntityRepository, ModelMapper modelMapper) {
        super(ingredientEntityRepository, modelMapper, IngredientEntity.class);
        this.ingredientEntityRepository = ingredientEntityRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Ingredient> findAll() {
        return ingredientEntityRepository.findAllByIsVisible(true)
                .stream()
                .map(i -> modelMapper.map(i, Ingredient.class))
                .collect(Collectors.toList());
    }

    @Override
    public Ingredient insert(IngredientRequest ingredientRequest) {
        IngredientEntity ingredientEntity = ingredientEntityRepository.findByName(ingredientRequest.getName());
        if (ingredientEntity != null) {
            return modelMapper.map(ingredientEntity, Ingredient.class);
        }
        Ingredient ingredient = insert(ingredientRequest, Ingredient.class);
        ingredient.setIsVisible(true);
        return ingredient;
    }

    @Override
    public Ingredient insertForEndpoint(IngredientRequest ingredientRequest) throws DuplicateValueException {
        IngredientEntity entity = ingredientEntityRepository.findByName(ingredientRequest.getName());
        if (entity != null) {
            if(!entity.getIsVisible()){
                entity.setIsVisible(true);
                return update(entity.getId(), entity, Ingredient.class);
            }
            else
                throw new DuplicateValueException();
        }
        return insert(ingredientRequest, Ingredient.class);
    }

    @Override
    public void delete(Integer id) {
        IngredientEntity entity = ingredientEntityRepository.findById(id).orElseThrow(NotFoundException::new);
        entity.setIsVisible(false);
        update(id, entity, Ingredient.class);
    }
}
