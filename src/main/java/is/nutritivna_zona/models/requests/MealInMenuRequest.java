package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class MealInMenuRequest {
    @NotBlank
    private String mealName;

    private String mealDescription;
    @NotNull
    private Integer mealTypeId;
    @NotNull
    private List<IngredientQuantityRequest> ingredients;
}
