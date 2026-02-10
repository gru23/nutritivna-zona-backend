package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class DiarySubmitionRequest {
    @NotNull
    private Integer id;

    @NotNull
    private Boolean isSubmitted;
}
