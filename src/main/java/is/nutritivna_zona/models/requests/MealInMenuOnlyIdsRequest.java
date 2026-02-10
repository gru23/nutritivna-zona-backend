package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MealInMenuOnlyIdsRequest {
    @NotNull
    private Integer mealId;

    @NotNull
    private Integer menuId;

    @NotNull
    private Integer mealTypeId;
}
