package is.nutritivna_zona.models.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class UserFull extends User {
    private Integer id;
    private Set<QuestionnaireAnswer> answers;
    private List<Measures> measures;
    private Set<FoodDiary> foodDiaries;
}
