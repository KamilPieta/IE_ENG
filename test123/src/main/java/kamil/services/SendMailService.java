package kamil.services;

import kamil.model.Mailer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by k on 04.05.2016.
 */
@Service
public class SendMailService {

    private JavaMailSender javaMailSender;
    private final String adminAdress="maildoprojektow@gmail.com";

    @Autowired
    public SendMailService(JavaMailSender javaMailSender){
        this.javaMailSender=javaMailSender;
    }

    public void sendMailMailer(Mailer mailer) throws MailException{
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(adminAdress);
        mail.setFrom(mailer.getAdressfrom());
        mail.setSubject(mailer.getSubject());
        mail.setText("Dnia " + mailer.getDate()+" Uzytkownik "+mailer.getName()+" wyslal wiadomosc o tresci: "+mailer.getContent());

        javaMailSender.send(mail);
    }
}
