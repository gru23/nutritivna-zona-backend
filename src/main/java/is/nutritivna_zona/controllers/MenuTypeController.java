package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.HttpException;
import is.nutritivna_zona.models.dto.MenuType;
import is.nutritivna_zona.models.requests.MenuTypeRequest;
import is.nutritivna_zona.services.MenuTypeService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menu-types")
public class MenuTypeController extends CrudController<Integer, MenuTypeRequest, MenuType> {
    private final MenuTypeService menuTypeService;

    public MenuTypeController(MenuTypeService menuTypeService) {
        super(menuTypeService, MenuType.class);
        this.menuTypeService = menuTypeService;
    }

    @Operation(summary = "Pronalazi sve tipove jelovnika koji su vidljivi (nisu obrisani za nutricionistu).")
    @GetMapping("/all-visible")
    List<MenuType> findAll() {
        return menuTypeService.findAll();
    }

    @ApiResponses(value = {
            @ApiResponse(responseCode = "409",
                    description = "Uneseni tip jelovnika već postoji u bazi - DUPLIKAT.",
                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MenuType insert(@RequestBody @Valid MenuTypeRequest menuTypeRequest) throws HttpException {
        return menuTypeService.insert(menuTypeRequest);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        menuTypeService.delete(id);
    }
}
