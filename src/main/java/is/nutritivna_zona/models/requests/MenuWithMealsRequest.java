package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class MenuWithMealsRequest {
    @NotBlank
    private String name;

    @NotBlank
    private String dayInWeek;

    @NotNull
    private Integer userId;

    private Integer menuTypeId;

    @NotNull
    private List<MealInMenuRequest> mealsInMenu;
}
