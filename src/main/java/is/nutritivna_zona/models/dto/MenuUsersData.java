package is.nutritivna_zona.models.dto;

import lombok.Data;

@Data
public class MenuUsersData {
    private Integer id;
    private String name;
    private String surname;
    private Double measuresHeight;
    private Double measuresBodyMass;
    private Double measuresWaistCircumference;
    private Double measuresHipsCircumference;
}
