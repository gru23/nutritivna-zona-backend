package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MeasureEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MeasuresEntityRepository extends JpaRepository<MeasureEntity, Integer> {
    List<MeasureEntity> getAllByUser_Id(Integer userId);
    MeasureEntity getMeasureByDateAndUser_Id(LocalDate date, Integer userId);
}
