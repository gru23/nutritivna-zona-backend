package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class FoodDiaryWithMealsRequest {
    @NotNull
    private LocalDate date;
    @NotNull
    private Integer userId;
    @NotNull
    private List<MealInFoodDiaryWithSymptomsRequest> meals;
}
