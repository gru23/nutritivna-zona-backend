package is.nutritivna_zona.services;

import is.nutritivna_zona.exceptions.NotFoundException;

public interface EmailService {
    Boolean recoveryPasswordEmail(String receiverUsername) throws NotFoundException;
    void deactivatedAccountEmail(String receiver);
    void activatedAccountEmail(String receiver);
    void sendConfirmationAccountEmail(String receiver, Integer id);
}
