package is.nutritivna_zona.models.dto;

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private Integer id;
    private String name;
    private String dayInWeek;
    private Integer userId;
    private String userName;
    private String userSurname;
    private String userUsername;
//    private Measures measures;
//    private MenuUsersData menuUsersData;
    private String menuTypeName;
    private List<MealInMenu> mealsInMenu;
}
