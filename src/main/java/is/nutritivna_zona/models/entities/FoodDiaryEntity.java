package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "food_diary")
public class FoodDiaryEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "date", nullable = false)
    private LocalDate date;

    @ColumnDefault("false")
    @Column(name = "is_submitted")
    private Boolean isSubmitted;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private is.nutritivna_zona.models.entities.UserEntity user;

    @OneToMany(mappedBy = "foodDiary", cascade = CascadeType.ALL)
    private List<MealInFoodDiaryEntity> mealInFoodDiaries = new LinkedList<>();

    @PrePersist
    public void prePersist() {
        if(this.isSubmitted == null) {
            this.isSubmitted = false;
        }
    }
}