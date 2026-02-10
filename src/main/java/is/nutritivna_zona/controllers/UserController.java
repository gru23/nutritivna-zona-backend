package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.Operation;
import is.nutritivna_zona.base.CrudController;
import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.dto.User;
import is.nutritivna_zona.models.requests.DiaryAvailableRequest;
import is.nutritivna_zona.models.requests.UserRequest;
import is.nutritivna_zona.services.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController extends CrudController<Integer, UserRequest, User> {
    private final UserService userService;

    public UserController(UserService userService) {
        super(userService, User.class);
        this.userService = userService;
    }

    @Operation(summary = "Ako lozinka nije mijenjana, poslati prazan string za password polje. Primjer:\"password\": \"\"")
    @PutMapping("/{id}")
    public User update(@PathVariable Integer id, @RequestBody @Valid UserRequest object) throws NotFoundException {
        return userService.update(id, object);
    }

    @DeleteMapping("/{id}")
    @Override
    public void delete(@PathVariable Integer id) {
        userService.delete(id);
    }

    @PostMapping("/new-diary")
    public void setIsDiaryAvailable(@RequestBody DiaryAvailableRequest object) throws NotFoundException {
        userService.setIsNewDiaryAvailable(object);
    }
}
