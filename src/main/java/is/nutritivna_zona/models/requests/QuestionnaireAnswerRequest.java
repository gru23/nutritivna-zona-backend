package is.nutritivna_zona.models.requests;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Data
public class QuestionnaireAnswerRequest {
    @NotNull
    private LocalDate date;
    @NotBlank
    private String currentGoal;
    @NotBlank
    private String dailyMealsNumber;
    @NotBlank
    private String nonConsumedGroceries;
    @NotBlank
    private String mandatoryFood;
    @NotBlank
    private String allergyIntolerance;
    @NotBlank
    private String supplementation;
    @NotBlank
    private String medicalCondition;
    @NotBlank
    private String selfPreparingFood;
    @NotBlank
    private String physicalActivityLevel;
    @NotBlank
    private String dailyActivities;
    @NotBlank
    private String bedtime;
    @NotNull
    private Integer userId;
}
