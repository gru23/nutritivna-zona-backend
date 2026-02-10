package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class IngredientRequest {
    @NotBlank
    private String name;
    private Boolean isVisible;
}
