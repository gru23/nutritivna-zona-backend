package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class IngredientQuantityWithIdsRequest {
    @NotNull
    private BigDecimal value;

    private String valueInWords;

    @NotNull
    private Integer ingredientId;

    @NotNull
    private Integer mealInMenuId;
}
