package is.nutritivna_zona.controllers;

import is.nutritivna_zona.models.dto.JwtUser;
import is.nutritivna_zona.models.dto.LoginResponse;
import is.nutritivna_zona.models.requests.LoginRequest;
import is.nutritivna_zona.models.requests.UserRequest;
import is.nutritivna_zona.services.AuthService;
import is.nutritivna_zona.services.UserService;
import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

    public AuthController(AuthService authService, UserService userService) {
        this.authService = authService;
        this.userService = userService;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest request)
    {
        return authService.login(request);
    }

    @GetMapping("state")
    public LoginResponse state(Authentication auth) {
        JwtUser jwtUser = (JwtUser) auth.getPrincipal();
        return userService.findById(jwtUser.getId(), LoginResponse.class);
    }

    @PostMapping("sign-up")
    public void signUp(@RequestBody @Valid UserRequest userRequest) {
        userService.signUp(userRequest);
    }

}


