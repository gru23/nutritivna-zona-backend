package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.QuestionnaireAnswerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionnaireAnswerEntityRepository extends JpaRepository<QuestionnaireAnswerEntity, Integer> {
    List<QuestionnaireAnswerEntity> getAllByUser_Id(Integer id);
}
