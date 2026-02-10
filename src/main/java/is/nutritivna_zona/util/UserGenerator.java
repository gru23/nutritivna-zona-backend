package is.nutritivna_zona.util;

import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class UserGenerator {
    static final int NUMBER_OF_USERS = 100;
    static final int BEGINNING_ID  = 2;

    public void generateRandomUsers() {
        try {
            List<String> names = Files.readAllLines(Paths.get("src/main/resources/users/names.txt"));
            List<String> surnames = Files.readAllLines(Paths.get("src/main/resources/users/surnames.txt"));

            if (names.isEmpty() || surnames.isEmpty()) {
                System.out.println("Name or/and surnames files are empty.");
                return;
            }

            Random rand = new Random();
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/users/users.sql.txt"));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // For checking duplicates
            Map<String, Integer> nicknameCounter = new HashMap<>();
            PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

            for (int i = BEGINNING_ID; i <= NUMBER_OF_USERS; i++) {
                String name = names.get(rand.nextInt(names.size())).trim();
                String surname = surnames.get(rand.nextInt(surnames.size())).trim();

                // Base nickname
                String base = transliterate((name + "." + surname)
                                .toLowerCase()
                                .replaceAll("\\s+", "")
                );

                // Adding number for duplicate nickname
                int count = nicknameCounter.getOrDefault(base, 0);
                nicknameCounter.put(base, count + 1);

                String username = base + (count == 0 ? "" : count);
                String email = base + (count == 0 ? "" : count) + "@mail.com";
                String password = encoder.encode(username).replace("{bcrypt}", "");

                LocalDate birthDate = generateDateOfBirth();
                boolean isProfileConfirmed = rand.nextBoolean();
                //profile can not be activated if it is not confirmed by admin
                Boolean isActivated = isProfileConfirmed && rand.nextBoolean();
                Boolean isNewDairyAvailable = rand.nextBoolean();
                Boolean isNewQuestionnaireAvailable = rand.nextBoolean();

                String sql = String.format(
                        "INSERT IGNORE INTO user (id, name, surname, birth_date, username, password, " +
                                "role, email, is_activated, is_new_diary_available, is_new_questionnaire_available, is_profile_confirmed) " +
                                "VALUES (%d, '%s', '%s', '%s', '%s', '%s', 'CLIENT', '%s', %s, %s, %s, %s);",
                        i, name, surname, birthDate.format(formatter), username, password, email, isActivated,
                        isNewDairyAvailable, isNewQuestionnaireAvailable, isProfileConfirmed
                );

                writer.write(sql);
                writer.newLine();
            }
            writer.close();
            System.out.println("sql.txt file successfully generated.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }

    private LocalDate generateDateOfBirth() {
        Random rand = new Random();
        int year = rand.nextInt(2005 - 1980 + 1) + 1980;
        int month = rand.nextInt(12) + 1;
        int day = rand.nextInt(28) + 1;
        return LocalDate.of(year, month, day);
    }

    private String transliterate(String text) {
        return text
                .replace("č", "c").replace("ć", "c")
                .replace("ž", "z").replace("š", "s")
                .replace("Č", "C").replace("Ć", "C")
                .replace("Ž", "Z").replace("Š", "S");
    }
}
