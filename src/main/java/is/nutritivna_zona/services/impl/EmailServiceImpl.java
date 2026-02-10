package is.nutritivna_zona.services.impl;

import is.nutritivna_zona.exceptions.NotFoundException;
import is.nutritivna_zona.models.entities.UserEntity;
import is.nutritivna_zona.repositories.UserEntityRepository;
import is.nutritivna_zona.services.EmailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;

import static is.nutritivna_zona.util.Constants.*;

@Service
public class EmailServiceImpl implements EmailService {
    private final PasswordEncoder passwordEncoder;
    private final JavaMailSender mailSender;
    private final UserEntityRepository userEntityRepository;
    @Value
   ("${spring.mail.username}") private String sender;
    @Value("${server.port}")
    private String PORT;

    public EmailServiceImpl(PasswordEncoder passwordEncoder, JavaMailSender mailSender,
                            UserEntityRepository userEntityRepository) {
        this.passwordEncoder = passwordEncoder;
        this.mailSender = mailSender;
        this.userEntityRepository = userEntityRepository;
    }

    private static String passwordGenerator() {
        return RandomStringUtils.insecure()
                .next(NUMBER_OF_CHARACTERS_FOR_NEW_PASSWORD, true, true);
    }

    @Override
    public Boolean recoveryPasswordEmail(String receiverUsername) throws NotFoundException {
        UserEntity user = userEntityRepository.findByUsername(receiverUsername);
        if(user == null)
            throw new NotFoundException();
        if(!user.getIsActivated())
            return false;
        SimpleMailMessage message = generateMailMessage(user.getEmail());
        message.setSubject(PASSWORD_RECOVERY_SUBJECT);
        String newPassword = passwordGenerator();
        user.setPassword(passwordEncoder.encode(newPassword));
        userEntityRepository.saveAndFlush(user);
        message.setText(PASSWORD_RECOVERY_TEXT_FIRST + newPassword
                + PASSWORD_RECOVERY_TEXT_SECOND + TEXT_FOOTER);
        return sendMail(mailSender, message);
    }

    @Override
    public void deactivatedAccountEmail(String receiver) {
        SimpleMailMessage message = generateMailMessage(receiver);
        message.setSubject(DEACTIVATE_ACCOUNT_SUBJECT);
        message.setText(DEACTIVATE_ACCOUNT_TEXT + TEXT_FOOTER);
//        mailSender.send(message);
        sendMail(mailSender, message);
    }

    @Override
    public void activatedAccountEmail(String receiver) {
        SimpleMailMessage message = generateMailMessage(receiver);
        message.setSubject(ACTIVATE_ACCOUNT_SUBJECT);
        message.setText(ACTIVATE_ACCOUNT_TEXT + TEXT_FOOTER);
//        mailSender.send(message);
        sendMail(mailSender, message);
    }

    @Override
    public void sendConfirmationAccountEmail(String receiver, Integer id) {
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

            String url = "http://localhost:" + PORT + "/profile-verify?uid=" + Base64.getUrlEncoder().encodeToString(id.toString().getBytes());
            String link = "<a href=\"" + url + "\"><br><br>👉 Potvrdi registraciju 👈</a><br><br><br>";

            helper.setTo(receiver);
            helper.setSubject(CONFIRMATION_ACCOUNT_SUBJECT);
            helper.setText(CONFIRMATION_ACCOUNT_TEXT + link + TEXT_FOOTER, true);
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }


    private SimpleMailMessage generateMailMessage(String receiverEmail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(sender);
        message.setTo(receiverEmail);
        return message;
    }

    private boolean sendMail(JavaMailSender mailSender, SimpleMailMessage message) {
        try {
            mailSender.send(message);
        } catch(MailSendException mse) {
            System.err.println(mse.getMessage());
            return false;
        }
        return true;
    }
}
