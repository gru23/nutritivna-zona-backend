package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.HttpException;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Ingredient;
import is.nutritivna_zona.models.dto.Meal;
import is.nutritivna_zona.models.requests.MealRequest;
import is.nutritivna_zona.services.MealInMenuHasIngredientService;
import is.nutritivna_zona.services.MealService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealController extends CrudController<Integer, MealRequest, Meal> {
    private final MealService mealService;
    private final MealInMenuHasIngredientService mealInMenuHasIngredientService;

    public MealController(MealService mealService, MealInMenuHasIngredientService mealInMenuHasIngredientService) {
        super(mealService, Meal.class);
        this.mealService = mealService;
        this.mealInMenuHasIngredientService = mealInMenuHasIngredientService;
    }

    @Operation(summary = "Pronalazi sve obroke koji su vidljivi (nisu obrisani za nutricionistu).")
    @GetMapping("/all-visible")
    List<Meal> findAll() {
        return mealService.findAll();
    }

    @Operation(summary = "Pronalazi sve sastojke koji su nekada uneseni u obroku sa navedenim imenom.")
    @GetMapping("/ingredients/{meal_name}")
    List<Ingredient> findAllIngredientsByMealName(@PathVariable @RequestBody String meal_name) {
        return mealInMenuHasIngredientService.findMealsIngredients(meal_name);
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "409",
                    description = "Uneseni obrok već postoji u bazi - DUPLIKAT.",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Meal insert(@RequestBody @Valid MealRequest object) throws HttpException {
        return mealService.insertForEndpoint(object);
    }

    @PutMapping("/{id}")
    public Meal update(@PathVariable Integer id, @RequestBody @Valid MealRequest object) throws NotFoundException {
        return mealService.update(id, object);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        mealService.delete(id);
    }
}
