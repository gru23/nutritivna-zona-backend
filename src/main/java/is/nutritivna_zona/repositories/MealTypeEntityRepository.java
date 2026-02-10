package is.nutritivna_zona.repositories;

import is.nutritivna_zona.models.entities.MealTypeEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MealTypeEntityRepository extends JpaRepository<MealTypeEntity, Integer> {
    MealTypeEntity findByName(String name);
    List<MealTypeEntity> findAllByIsVisibleOrderByOrdinalAsc(Boolean isVisible);

    @Modifying
    @Transactional
    @Query("UPDATE MealTypeEntity m SET m.ordinal = m.ordinal + 1 WHERE m.ordinal >= :ordinal")
    void shiftOrdinalsUpFrom(@Param("ordinal") Integer ordinal);
}
