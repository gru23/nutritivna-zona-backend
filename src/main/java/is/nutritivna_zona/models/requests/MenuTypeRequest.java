package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MenuTypeRequest {
    @NotBlank
    private String name;
    private Boolean isVisible;
}
