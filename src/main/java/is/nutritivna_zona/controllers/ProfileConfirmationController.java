package is.nutritivna_zona.controllers;

import is.nutritivna_zona.services.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile-verify")
public class ProfileConfirmationController {
    private final UserService userService;

    public ProfileConfirmationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity<String> confirmProfile(@RequestParam("uid") String encodedId) {
        Boolean isConfirmed = userService.setProfileIsConfirmed(encodedId);

        String html;
        if(isConfirmed)
            html = "<html><head><meta charset=\"UTF-8\"><title>Verifikacija</title></head>" +
                    "<body><h2 style='color:green;'>✅ Verifikacija uspješna!</h2>"
                    + "<p>Vaša registracija je uspješno potvrđena. Ukoliko je " +
                    "novčana transakcija izvršena možete pristupiti sistemu.</p></body></html>";
        else
            html = "<html><head><meta charset=\"UTF-8\"><title> Verifikacija</title></head>" +
                    "<body><h2 style='color:red;'>❌ Verifikacija neuspješna!</h2>"
                    + "<p>Vaša registracija nije uspjela! Možda ste se već " +
                    "registrovali preko ovog linka.</p></body></html>";
        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("text/html; charset=UTF-8"))
                .body(html);
    }
}
