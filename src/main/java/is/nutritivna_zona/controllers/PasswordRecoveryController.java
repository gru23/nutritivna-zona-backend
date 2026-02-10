package is.nutritivna_zona.controllers;

import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import is.nutritivna_zona.models.requests.PasswordRecoveryRequest;
import is.nutritivna_zona.services.EmailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/password-recovery")
public class PasswordRecoveryController {
    private final EmailService emailService;

    public PasswordRecoveryController(EmailService emailService) {
        this.emailService = emailService;
    }
    @ApiResponses(value = {
            @ApiResponse(responseCode = "true",
                    description = "Mail sa novom lozinkom uspješno poslat.",
                    content = @Content(schema = @Schema())),
            @ApiResponse(responseCode = "false",
                    description = "Mail sa novom lozinkom nije poslat iz razloga što je korisnički nalog " +
                            "deaktiviran ili nije dozvoljeno korištenje SMTPa na mreži.",
                    content = @Content(schema = @Schema())),
            @ApiResponse(responseCode = "404", description = "Korisničko ime ne postoji u bazi.",
                    content = @Content(schema = @Schema())),
//            @ApiResponse(responseCode = "500",
//                    description = "Nije dozvoljeno korištenje SMTPa na mreži.",
//                    content = @Content(schema = @Schema()))
    })
    @PostMapping
    public Boolean sendPasswordRecovery(@RequestBody PasswordRecoveryRequest receiver) {
        return emailService.recoveryPasswordEmail(receiver.getReceiverUsername());
    }
}
