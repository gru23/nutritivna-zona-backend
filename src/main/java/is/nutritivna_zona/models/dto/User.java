package is.nutritivna_zona.models.dto;

import is.nutritivna_zona.models.enums.Role;
import lombok.Data;

import java.time.LocalDate;

@Data
public class User {
    private Integer id;

    private String name;

    private String surname;

    private LocalDate birthDate;

    private String username;

    private String email;

    private Boolean isActivated;

    private Boolean isNewDiaryAvailable;

    private Boolean isNewQuestionnaireAvailable;

    private Boolean isProfileConfirmed;

    private Role role;
}
