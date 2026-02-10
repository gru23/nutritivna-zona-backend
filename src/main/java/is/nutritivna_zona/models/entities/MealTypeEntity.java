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
@Table(name = "meal_type")
public class MealTypeEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "ordinal", nullable = false)
    private Integer ordinal;

    @ColumnDefault("true")
    @Column(name = "is_visible")
    private Boolean isVisible;

    @OneToMany(mappedBy = "mealTypeEntity")
    private List<MealInFoodDiaryEntity> mealInFoodDiaries = new LinkedList<>();

    @OneToMany(mappedBy = "mealType")
    private List<MealInMenuEntity> mealInMenus = new LinkedList<>();

    @PrePersist
    public void prePersist() {
        if(this.isVisible == null)
            this.isVisible = true;
    }
}