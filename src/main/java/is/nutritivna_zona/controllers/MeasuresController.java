package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Measures;
import is.nutritivna_zona.models.requests.MeasuresRequest;
import is.nutritivna_zona.services.MeasuresService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/measures")
public class MeasuresController extends CrudController<Integer, MeasuresRequest, Measures> {
    private final MeasuresService measuresService;

    public MeasuresController(MeasuresService measuresService) {
        super(measuresService, Measures.class);
        this.measuresService = measuresService;
    }

    @Operation(summary = "Pronalazi sve mjere korisnika sa navedenim id-em.")
    @GetMapping("/users/{id}")
    public List<Measures> findAllByUserId(@PathVariable Integer id) throws NotFoundException {
        return measuresService.findAllMeasuresByUserId(id);
    }

    @GetMapping("/date/{user_id}")
    public Measures findMeasuresByDate(@PathVariable Integer user_id, LocalDate date) throws NotFoundException {
        return measuresService.findMeasureByDateAndUserId(date, user_id);
    }
}
