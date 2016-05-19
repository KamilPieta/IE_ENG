package kamil.kamilControllers;

import kamil.model.Mailer;
import kamil.responses.MailerResponse;
import kamil.services.SendMailService;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by k on 04.05.2016.
 */
@RestController()
@RequestMapping("/mail")
public class SwiftMailerController {


private static final Logger logger = Logger.getLogger(SwiftMailerController.class.getName());
    private Mailer mailer;


@Autowired
private SendMailService sendMailService;

    @RequestMapping(value="/swiftMailer", method= RequestMethod.POST)
    public MailerResponse getValues(@RequestBody Mailer mailer)  {


        mailer.setDate(Calendar.getInstance().getTime().toString());
        logger.info(mailer.toString());
        MailerResponse mailerResponse=new MailerResponse();
        try{
        sendMailService.sendMailMailer(mailer);
            mailerResponse.setMessage("Wyslano");
            mailerResponse.setResoult(true);
        }
        catch(MailException e)
        {
            logger.info("OPS!" + e.getMessage());
            mailerResponse.setMessage("blad");
            mailerResponse.setResoult(false);
        }

        return mailerResponse;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView httpServicePostExample( ModelMap model ) {
        return new ModelAndView("index");
    }



}
