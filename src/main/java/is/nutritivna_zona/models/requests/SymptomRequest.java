package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SymptomRequest {
    @NotBlank
    private String name;
    private Boolean isVisible;
}
