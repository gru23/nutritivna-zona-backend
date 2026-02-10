package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.models.dto.Symptom;
import is.nutritivna_zona.models.entities.SymptomEntity;
import is.nutritivna_zona.models.requests.SymptomRequest;
import is.nutritivna_zona.repositories.SymptomEntityRepository;
import is.nutritivna_zona.services.SymptomService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SymptomServiceImpl extends CrudJpaService<SymptomEntity, Integer> implements SymptomService {
    private final ModelMapper modelMapper;
    private final SymptomEntityRepository symptomEntityRepository;

    public SymptomServiceImpl(ModelMapper modelMapper, SymptomEntityRepository repository, SymptomEntityRepository symptomEntityRepository) {
        super(repository, modelMapper, SymptomEntity.class);
        this.symptomEntityRepository = symptomEntityRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<Symptom> findAll() {
        return symptomEntityRepository.findAllByIsVisible(true)
                .stream()
                .map(s -> modelMapper.map(s, Symptom.class))
                .collect(Collectors.toList());
    }

    @Override
    public Symptom insert(SymptomRequest symptomRequest) throws DuplicateValueException {
        SymptomEntity entity = symptomEntityRepository.findByName(symptomRequest.getName());
        if(entity != null) {
            if (!entity.getIsVisible()){
                entity.setIsVisible(true);
                return update(entity.getId(), entity, Symptom.class);
            }
            else
                throw new DuplicateValueException();
        }
        return super.insert(symptomRequest, Symptom.class);
    }

    @Override
    public void delete(Integer id) {
        SymptomEntity entity = symptomEntityRepository.findById(id).get();
        entity.setIsVisible(false);
        update(id, entity, Symptom.class);
    }
}
