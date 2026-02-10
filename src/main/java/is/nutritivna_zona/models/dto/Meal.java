package is.nutritivna_zona.models.dto;

import lombok.Data;

@Data
public class Meal {
    private Integer id;
    private String name;
    private String description;
    private Boolean isVisible;
}
