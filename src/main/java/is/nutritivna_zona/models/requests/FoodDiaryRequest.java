package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class FoodDiaryRequest {
    @NotNull
    private LocalDate date;

    @NotNull
    private Integer userId;

    private Boolean isSubmitted;
}
