package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.MealInFoodDiary;
import is.nutritivna_zona.models.dto.FoodDiary;
import is.nutritivna_zona.models.requests.DiarySubmitionRequest;
import is.nutritivna_zona.models.requests.FoodDiaryRequest;
import is.nutritivna_zona.models.requests.MealInFoodDiaryWithSymptomsRequest;
import is.nutritivna_zona.services.FoodDiaryService;
import is.nutritivna_zona.services.MealInFoodDiaryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diaries")
public class FoodDiaryController {//extends CrudController<Integer, FoodDiaryRequest, FoodDiary> {
    private final FoodDiaryService foodDiaryService;
    private final MealInFoodDiaryService mealInFoodDiaryService;

    public FoodDiaryController(FoodDiaryService foodDiaryService, MealInFoodDiaryService mealInFoodDiaryService) {
        //super(foodDiaryService, FoodDiary.class);
        this.foodDiaryService = foodDiaryService;
        this.mealInFoodDiaryService = mealInFoodDiaryService;
    }

//    @Operation(summary = "POST zahtjev za dodavanje novog dnevnika gdje se šalje JSON kompletnog dnevnika.")
//    @PostMapping("/front")
//    @ResponseStatus(HttpStatus.CREATED)
//    public FoodDiary insert(@RequestBody @Valid FoodDiaryWithMealsRequest diaryRequest) {
//        return foodDiaryService.insert(diaryRequest);
//    }

    @GetMapping("/{id}")
    public FoodDiary findById(@PathVariable Integer id) {
        return foodDiaryService.findById(id, FoodDiary.class);
    }

    @Operation(summary = "Pronalazi sve dnevnike korisnika čiji je id naveden.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "404", description = "Korisnik sa datim id-em ne postoji.",
                    content = @Content(schema = @Schema())),
    })
    @GetMapping("/users/{user_id}")
    public List<FoodDiary> getAllUsersDiaries(@PathVariable Integer user_id) {
        return foodDiaryService.getAllDiariesByUserId(user_id);
    }

    @Operation(summary = "POST zahtjev za dodavanje novog dnevnika. " +
            "Kreirani dnevnik je prazan pa se popunjava preko POST: /diaries/add-meal")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FoodDiary insert(@RequestBody @Valid FoodDiaryRequest diaryRequest) {
        return foodDiaryService.create(diaryRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        foodDiaryService.delete(id);
    }

    @Operation(summary = "Dodaje novi obrok u navedeni dnevnik. " +
            "NAPOMENA: kljuc 'time' se navodi u formatu \"time\": \"11:30\" - moguce je navesti i sekunde (11:30:15).")
    @PostMapping("/add-meal")
    @ResponseStatus(HttpStatus.CREATED)
    public MealInFoodDiary insert(@RequestBody @Valid MealInFoodDiaryWithSymptomsRequest mealInFoodDiaryRequest) {
        return mealInFoodDiaryService.insert(mealInFoodDiaryRequest);
    }

    @PutMapping("/meals/{meal_id}")
    public MealInFoodDiary update(@PathVariable Integer meal_id, @RequestBody @Valid MealInFoodDiaryWithSymptomsRequest mealInFoodDiaryRequest) throws NotFoundException {
        return mealInFoodDiaryService.update(meal_id, mealInFoodDiaryRequest);
    }

    @Operation(summary = "Potvrđivanje da li je dnevnik predan (submitted)")
    @PutMapping("/{id}")
    public void confirmSubmit(@RequestBody DiarySubmitionRequest request) {
        foodDiaryService.setIsSubmitted(request);
    }
}