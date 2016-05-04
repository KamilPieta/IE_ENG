package kamil.kamilControllers;

import kamil.model.Mailer;
import kamil.services.SendMailService;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by k on 04.05.2016.
 */
@Controller
public class SwiftMailerController {


private Logger logger = Logger.getLogger(SwiftMailerController.class.getName());
    private Mailer mailer;
@Autowired
private SendMailService sendMailService;

    @RequestMapping(value="/swiftMailer", method= RequestMethod.POST)
    public String getValues(@RequestParam("clientName") String name, @RequestParam("clientEmail")String email,@RequestParam("clientSubject")String subject,@RequestParam("userMsg")String content)  {

        mailer = new Mailer();
        mailer.setName(name);
        mailer.setAdressfrom(email);
        mailer.setSubject(subject);
        mailer.setContent(content);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ss:mm:HH");
        Date date = new Date();
        mailer.setDate(dateFormat.format(date));
        mailer.setMailID(1);
        logger.info(mailer.toString());
        try{
        sendMailService.sendMailMailer(mailer);
        }
        catch(MailException e)
        {
            logger.info("OPS!" + e.getMessage());
        }
        return "dziekujemy";
    }





}
