package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.HttpException;
import is.nutritivna_zona.models.dto.MealType;
import is.nutritivna_zona.models.requests.MealTypeRequest;
import is.nutritivna_zona.services.MealTypeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meal-types")
public class MealTypeController extends CrudController<Integer, MealTypeRequest, MealType> {
    private final MealTypeService mealTypeService;

    public MealTypeController(MealTypeService mealTypeService) {
        super(mealTypeService, MealType.class);
        this.mealTypeService = mealTypeService;
    }

    @Operation(summary = "Pronalazi sve tipove obroka koji su vidljivi (nisu obrisani za nutricionistu).")
    @GetMapping("/all-visible")
    List<MealType> findAll() {
        return mealTypeService.findAll();
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "409",
                    description = "Uneseni tip obroka već postoji u bazi - DUPLIKAT.",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MealType insert(@RequestBody @Valid MealTypeRequest mealTypeRequest) throws HttpException {
        return mealTypeService.insert(mealTypeRequest);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        mealTypeService.delete(id);
    }


}
