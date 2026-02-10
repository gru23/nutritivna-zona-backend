package is.nutritivna_zona.models;

import is.nutritivna_zona.models.dto.Symptom;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
public class MealInFoodDiary {
    private Integer id;

    private String name;

    private LocalDate date;

    private LocalTime time;

    private String dayInWeek;

    private Integer foodDiaryId;

    private Integer mealTypeEntityId;

    private List<Symptom> symptoms;
}
