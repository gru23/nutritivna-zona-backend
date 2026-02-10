package is.nutritivna_zona.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class MealInMenu {
    private Integer id;
    private Integer mealTypeOrdinal;
    private String mealTypeName;
    private Integer mealId;
    private String mealName;
    private String mealDescription;
    private List<IngredientQuantity> ingredientQuantities;
}
