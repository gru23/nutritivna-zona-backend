package is.nutritivna_zona.models.entities;

import is.nutritivna_zona.base.BaseEntity;
import is.nutritivna_zona.models.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user")
public class UserEntity implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @Size(max = 255)
    @NotNull
    @Column(name = "surname", nullable = false)
    private String surname;

    @NotNull
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    @Size(max = 255)
    @NotNull
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Size(min = 6, max = 320)
    @NotNull
    @Column(name = "password", nullable = false)
    private String password;

    @Email
    @Size(min = 6, max = 320)
    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;

    @ColumnDefault("false")
    @Column(name = "is_activated")
    private Boolean isActivated;

    @ColumnDefault("true")
    @Column(name = "is_new_diary_available")
    private Boolean isNewDiaryAvailable;

    @ColumnDefault("true")
    @Column(name = "is_new_questionnaire_available")
    private Boolean isNewQuestionnaireAvailable;

    @ColumnDefault("false")
    @Column(name = "is_profile_confirmed")
    private Boolean isProfileConfirmed;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<FoodDiaryEntity> foodDiaries = new LinkedList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<MeasureEntity> measures = new LinkedList<>();

    /*
    U ovom slucaju nije vazan kaskadni tip jer postoji metoda za brisanje menija koja se poziva
    prije brisanja korisnika, da se ta metoda ne poziva onda bi doslo do greske.
    Mozda nece doci do greske ako je ovdje kaskado i ako su mealsInMenu u Menu isto kaskadni
     */
    @OneToMany(mappedBy = "user")//, cascade = CascadeType.ALL)
    private List<MenuEntity> menus = new LinkedList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<QuestionnaireAnswerEntity> questionnaireAnswers = new LinkedList<>();

    @PrePersist
    public void prePersist() {
        if (this.isActivated == null) {
            this.isActivated = false;
        }
        if (this.isNewDiaryAvailable == null) {
            this.isNewDiaryAvailable = true;
        }
        if (this.isNewQuestionnaireAvailable == null) {
            this.isNewQuestionnaireAvailable = true;
        }
        if (this.isProfileConfirmed == null) {
            this.isProfileConfirmed = false;
        }
    }
}