package is.nutritivna_zona.models.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "meal_in_menu_has_ingredient")
public class MealInMenuHasIngredientEntity {
    public MealInMenuHasIngredientEntity(MealInMenuHasIngredientEntityId id) {
        this.id = id;
    }

    @EmbeddedId
    private MealInMenuHasIngredientEntityId id;

    @MapsId("mealInMenuId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "meal_in_menu_id", nullable = false)
    private MealInMenuEntity mealInMenu;

    @MapsId("ingredientId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private IngredientEntity ingredient;

}