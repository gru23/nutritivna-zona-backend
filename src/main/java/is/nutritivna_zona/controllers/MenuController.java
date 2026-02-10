package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.Menu;
import is.nutritivna_zona.models.requests.MenuRequest;
import is.nutritivna_zona.models.requests.MenuWithMealsRequest;
import is.nutritivna_zona.services.MenuService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController extends CrudController<Integer, MenuRequest, Menu> {
    private final MenuService menuService;

    public MenuController(MenuService menuService) {
        super(menuService, Menu.class);
        this.menuService = menuService;
    }

    @Operation(summary = "Pronalazi sve jelovnike korisnika čiji je id naveden.")
    @GetMapping("/users/{user_id}")
    public List<Menu> getAllUsersMenus(@PathVariable Integer user_id) {
        return menuService.getAllByUserId(user_id);
    }

    @Operation(summary = "POST zahtjev za dodavanje novog jelovnika gdje se šalje JSON kompletnog jelovnika.")
    @PostMapping("/front")
    @ResponseStatus(HttpStatus.CREATED)
    public Menu insert(@RequestBody @Valid MenuWithMealsRequest menuRequest) {
        return menuService.insert(menuRequest);
    }

    @Operation(summary = "PUT zahtjev za ažuriranje jelovnika gdje se šalje JSON kompletnog jelovnika.")
    @PutMapping("/front/{id}")
    public Menu update(@PathVariable Integer id, @RequestBody @Valid MenuWithMealsRequest menuRequest)  throws NotFoundException {
        return menuService.update(id, menuRequest);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        menuService.delete(id);
    }
}
