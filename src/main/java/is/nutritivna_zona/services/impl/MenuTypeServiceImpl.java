package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.base.CrudJpaService;
import is.nutritivna_zona.exceptions.DuplicateValueException;
import is.nutritivna_zona.models.dto.MenuType;
import is.nutritivna_zona.models.entities.MenuTypeEntity;
import is.nutritivna_zona.models.requests.MenuTypeRequest;
import is.nutritivna_zona.repositories.MenuTypeEntityRepository;
import is.nutritivna_zona.services.MenuTypeService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class MenuTypeServiceImpl extends CrudJpaService<MenuTypeEntity, Integer> implements MenuTypeService {
    private final MenuTypeEntityRepository menuTypeEntityRepository;
    private final ModelMapper modelMapper;

    public MenuTypeServiceImpl(MenuTypeEntityRepository menuTypeEntityRepository, ModelMapper modelMapper) {
        super(menuTypeEntityRepository, modelMapper, MenuTypeEntity.class);
        this.menuTypeEntityRepository = menuTypeEntityRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<MenuType> findAll() {
        return menuTypeEntityRepository.findAllByIsVisible(true)
                .stream()
                .map(m -> modelMapper.map(m, MenuType.class))
                .collect(Collectors.toList());
    }

    @Override
    public MenuType insert(MenuTypeRequest menuTypeRequest) throws DuplicateValueException {
        MenuTypeEntity entity = menuTypeEntityRepository.findByName(menuTypeRequest.getName());
        if(entity != null) {
            if (!entity.getIsVisible()){
                entity.setIsVisible(true);
                return update(entity.getId(), entity, MenuType.class);
            }
            else
                throw new DuplicateValueException();
        }
        return super.insert(menuTypeRequest, MenuType.class);
    }

    @Override
    public void delete(Integer id) {
        MenuTypeEntity entity = menuTypeEntityRepository.findById(id).get();
        entity.setIsVisible(false);
        update(id, entity, MenuType.class);
    }
}
