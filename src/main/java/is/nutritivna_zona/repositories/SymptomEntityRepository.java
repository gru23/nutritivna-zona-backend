package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.SymptomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SymptomEntityRepository extends JpaRepository<SymptomEntity, Integer> {
    SymptomEntity findByName(String name);
    List<SymptomEntity> findAllByIsVisible(boolean isVisible);
}
