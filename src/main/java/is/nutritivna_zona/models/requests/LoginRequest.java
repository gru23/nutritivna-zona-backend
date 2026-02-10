package is.nutritivna_zona.models.requests;


import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest {

    @NotBlank
    private String username;
    @NotBlank
    private String password;


}


