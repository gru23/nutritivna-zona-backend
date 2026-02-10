package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.QuestionnaireAnswer;
import is.nutritivna_zona.models.requests.QuestionnaireAnswerRequest;
import is.nutritivna_zona.services.QuestionnaireAnswerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireAnswersController extends CrudController<Integer, QuestionnaireAnswerRequest, QuestionnaireAnswer> {
    private final QuestionnaireAnswerService questionnaireAnswerService;

    public QuestionnaireAnswersController(QuestionnaireAnswerService questionnaireAnswerService) {
        super(questionnaireAnswerService, QuestionnaireAnswer.class);
        this.questionnaireAnswerService = questionnaireAnswerService;
    }

    @Operation(summary = "Pronalazi sve odgovore upitnika korisnika sa navedenim id-em.")
    @GetMapping("/users/{user_id}")
    public List<QuestionnaireAnswer> findAllByUserId(@PathVariable Integer user_id) throws NotFoundException {
        return questionnaireAnswerService.getAllQuestionnaireAnswersByClientId(user_id);
    }
}
