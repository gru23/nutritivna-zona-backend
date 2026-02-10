package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "ingredient")
public class IngredientEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @ColumnDefault("true")
    @Column(name = "is_visible")
    private Boolean isVisible;

    @ManyToMany
    @JoinTable(name = "meal_in_menu_has_ingredient",
            joinColumns = @JoinColumn(name = "ingredient_id"),
            inverseJoinColumns = @JoinColumn(name = "meal_in_menu_id"))
    private List<MealInMenuEntity> mealInMenus = new LinkedList<>();

    @OneToMany(mappedBy = "ingredient")
    private List<IngredientQuantityEntity> ingredientQuantities = new LinkedList<>();

    @PrePersist
    public void prePersist() {
        if(this.isVisible == null)
            this.isVisible = true;
    }
}