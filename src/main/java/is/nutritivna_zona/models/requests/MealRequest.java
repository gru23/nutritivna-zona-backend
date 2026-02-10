package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class MealRequest {
    @NotBlank
    private String name;
    private String description;
    private Boolean isVisible;
}
