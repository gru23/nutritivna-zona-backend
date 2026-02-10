package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class MenuRequest {
    @NotBlank
    private String name;

    private Integer menuTypeId;

    @NotBlank
    private String dayInWeek;

    @NotNull
    private Integer userId;
}
