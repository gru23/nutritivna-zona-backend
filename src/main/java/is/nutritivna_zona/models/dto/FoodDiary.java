package is.nutritivna_zona.models.dto;

import is.nutritivna_zona.models.MealInFoodDiary;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class FoodDiary {
    private Integer id;

    private LocalDate date;

    private String userUsername;

    private Boolean isSubmitted;

    private List<MealInFoodDiary> mealInFoodDiaries;
}
