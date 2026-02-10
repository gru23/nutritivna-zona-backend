package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.HttpException;
import is.nutritivna_zona.models.dto.Ingredient;
import is.nutritivna_zona.models.requests.IngredientRequest;
import is.nutritivna_zona.services.IngredientService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController extends CrudController<Integer, IngredientRequest, Ingredient> {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        super(ingredientService, Ingredient.class);
        this.ingredientService = ingredientService;
    }

    @Operation(summary = "Pronalazi sve sastojke koji su vidljivi (nisu obrisani za nutricionistu).")
    @GetMapping("/all-visible")
    List<Ingredient> findAll() {
        return ingredientService.findAll();
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "409",
                    description = "Uneseni sastojak već postoji u bazi - DUPLIKAT.",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Ingredient insert(@RequestBody @Valid IngredientRequest ingredientRequest) throws HttpException {
        return ingredientService.insertForEndpoint(ingredientRequest);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        ingredientService.delete(id);
    }
}
