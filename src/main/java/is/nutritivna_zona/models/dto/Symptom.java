package is.nutritivna_zona.models.dto;

import lombok.Data;

@Data
public class Symptom {
    private Integer id;
    private String name;
    private Boolean isVisible;
}