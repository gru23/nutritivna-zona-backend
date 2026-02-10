package is.nutritivna_zona.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Constants {
    //Email service constants
    public static final Integer NUMBER_OF_CHARACTERS_FOR_NEW_PASSWORD = 20;
    public static final String TEXT_FOOTER =
            "\n\n\nNutritivna zona\n" +
                    LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm")) +
                    "\n" +
                    LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    //Password recovery
    public static final String PASSWORD_RECOVERY_SUBJECT =
            "Zahtjev za novu lozinku - Nutritivna zona";
    public static final String PASSWORD_RECOVERY_TEXT_FIRST =
            "Poštovani/a,\nVaša nova lozinka je: ";
    public static final String PASSWORD_RECOVERY_TEXT_SECOND =
            """
                    
                    Ukolilo imate bilo kakvih pitanja, slobodno nas kontaktirajte.
                    
                    Vaša Nutritivna zona.
                    """;
    //Deactivate
    public static final String DEACTIVATE_ACCOUNT_SUBJECT =
            "Deaktivacija naloga - Nutritivna zona";
    public static final String DEACTIVATE_ACCOUNT_TEXT =
            """
                    Poštovani/a,\s
                    Vaš nalog je deaktiviran. Za više informacija, molimo Vas da nas kontaktirate.
                    Hvala na razumijevanju.
                    
                    Vaša Nutritivna zona.
                    """;
    //Activate
    public static final String ACTIVATE_ACCOUNT_SUBJECT =
            "Aktivacija naloga - Nutritivna zona";
    public static final String ACTIVATE_ACCOUNT_TEXT =
            """
                    Poštovani/a,
                    Vaš nalog je uspješno aktiviran. Ukoliko imate bilo kakvih pitanja ili \
                    problema tokom prijave, slobodno nas kontaktirajte.
                    
                    Vaša Nutritivna zona.
                    """;

    //Confirmation
    public static final String CONFIRMATION_ACCOUNT_SUBJECT =
            "Potvrda registrovanog naloga - Nutritivna zona";
    public static final String CONFIRMATION_ACCOUNT_TEXT =
            """
                    Poštovani/a,<br>
                    Hvala Vam što ste se registrovali!<br>
                    Da biste završili proces registracije, molimo Vas da potvrdite svoju email adresu klikom na link na kraju mail-a.<br>
                    <br>
                    Ako niste Vi pokrenuli ovu registraciju, slobodno zanemarite ovu poruku.<br>
                    Ukoliko imate bilo kakvih pitanja, slobodno nas kontaktirajte.<br>
                    <br>
                    Vaša Nutritivna zona.
                    """;
}
