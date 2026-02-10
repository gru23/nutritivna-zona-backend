package is.nutritivna_zona.models.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class IngredientQuantity {
    private Integer id;
    private String ingredientName;
    private Boolean ingredientIsVisible;
    private String unit;
    private BigDecimal value;
    private Integer mealInMenuId;
    private Integer ingredientId;
}
