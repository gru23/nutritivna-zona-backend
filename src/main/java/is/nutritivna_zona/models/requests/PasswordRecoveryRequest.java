package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class PasswordRecoveryRequest {
    @NotBlank
    @Email
    private String receiverUsername;
}
