package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MealTypeRequest {
    @NotBlank
    private String name;
    @NotNull
    private Integer ordinal;
    private Boolean isVisible;
}
