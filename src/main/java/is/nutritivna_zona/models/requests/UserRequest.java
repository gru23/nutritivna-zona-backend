package is.nutritivna_zona.models.requests;

import is.nutritivna_zona.models.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String surname;
    @NotNull
    private LocalDate birthDate;
    @NotBlank
    private String username;
    @NotBlank
    @Email
    private String email;

    private String password;

    private Boolean isActivated;

    private Boolean isNewQuestionnaireAvailable;

    private Boolean isNewDiaryAvailable;

    private Boolean isProfileConfirmed;
    
    private Role role;
}
