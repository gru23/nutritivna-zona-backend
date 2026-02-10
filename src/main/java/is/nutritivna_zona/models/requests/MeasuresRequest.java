package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class MeasuresRequest {
    @NotNull
    private LocalDate date;
    @NotNull
    private BigDecimal waistCircumference;
    @NotNull
    private BigDecimal stomachCircumference;
    @NotNull
    private BigDecimal hipsCircumference;
    @NotNull
    private BigDecimal height;
    @NotNull
    private BigDecimal bodyMass;
    @NotNull
    private Integer userId;
}
