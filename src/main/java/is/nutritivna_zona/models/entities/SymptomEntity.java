package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "symptom")
public class SymptomEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotBlank
    @Size(min = 2, max = 255)
    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @ColumnDefault("true")
    @Column(name = "is_visible")
    private Boolean isVisible;

    @ManyToMany
    @JoinTable(name = "meal_in_food_diary_has_symptom",
            joinColumns = @JoinColumn(name = "symptom_id"),
            inverseJoinColumns = @JoinColumn(name = "meal_in_food_diary_id"))
    private List<MealInFoodDiaryEntity> mealInFoodDiaries = new LinkedList<>();

    @PrePersist
    public void prePersist() {
        if(this.isVisible == null)
            this.isVisible = true;
    }
}