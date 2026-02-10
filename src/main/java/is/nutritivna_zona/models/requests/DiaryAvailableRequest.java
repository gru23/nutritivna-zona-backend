package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
/**
 * Represents request for setting a new diary for user with userId
 * true - user will have new diary to fill
 */
public class DiaryAvailableRequest {
    @NotNull
    private Integer userId;
    @NotNull
    private Boolean isDiaryAvailable;
}
