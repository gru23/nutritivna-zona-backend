package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
public class MealInFoodDiaryWithSymptomsRequest {
    @NotBlank
    private String name;
    @NotNull
    private LocalDate date;
    @NotNull
    private LocalTime time;
    @NotBlank
    private String dayInWeek;
    @NotNull
    private Integer foodDiaryId;
    @NotNull
    private Integer mealTypeEntityId;
    @NotNull
    private List<Integer> symptoms;
}
