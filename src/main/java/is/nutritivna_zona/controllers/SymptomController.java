package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.HttpException;
import is.nutritivna_zona.models.dto.Symptom;
import is.nutritivna_zona.models.requests.SymptomRequest;
import is.nutritivna_zona.services.SymptomService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/symptoms")
public class SymptomController extends CrudController<Integer, SymptomRequest, Symptom> {
    private final SymptomService symptomService;

    public SymptomController(SymptomService symptomService) {
        super(symptomService, Symptom.class);
        this.symptomService = symptomService;
    }

    @Operation(summary = "Pronalazi sve simptome koji su vidljivi (nisu obrisani za nutricionistu).")
    @GetMapping("/all-visible")
    List<Symptom> findAll() {
        return symptomService.findAll();
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "409",
                    description = "Uneseni simpotom već postoji u bazi - DUPLIKAT.",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Symptom insert(@RequestBody @Valid SymptomRequest object) throws HttpException {
        return symptomService.insert(object);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        symptomService.delete(id);
    }
}
