package is.nutritivna_zona.models.dto;

import lombok.Data;

@Data
public class MealType {
    private Integer id;
    private String name;
    private Integer ordinal;
    private Boolean isVisible;
}
