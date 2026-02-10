package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class IngredientQuantityRequest {
    @NotBlank
    private String ingredientName;
    @NotNull
    private Integer value;

    private String unit;
}