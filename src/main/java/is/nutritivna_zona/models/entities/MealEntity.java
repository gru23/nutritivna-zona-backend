package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.util.LinkedList;
import java.util.List;

@Data
@Getter
@Setter
@Entity
@Table(name = "meal")
public class MealEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description")
    private String description;

    @ColumnDefault("true")
    @Column(name = "is_visible")
    private Boolean isVisible;

    @OneToMany(mappedBy = "meal")
    private List<MealInMenuEntity> mealInMenus = new LinkedList<>();

    @PrePersist
    public void prePersist() {
        if(this.isVisible == null)
            this.isVisible = true;
    }
}