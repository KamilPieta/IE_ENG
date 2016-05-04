package kamil.kamilControllers;


import kamil.model.Mailer;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by k on 04.05.2016.
 */
@RestController
public class MaillerRestController {

    private static Integer mailID ;
    private static Map<Integer, Mailer> MailMap;

    private static Mailer save_Mail(Mailer mailer){
        if (MailMap == null){
            MailMap=new HashMap<Integer,Mailer>();
            mailID=0;
        }
        mailer.setMailID(mailID);
        mailID+=1;
        MailMap.put(mailer.getMailID(),mailer);
        return mailer;
    }


    static{
        Mailer mail1 = new Mailer();
        mail1.setAdressfrom("AdresFrom:tirururu");
        mail1.setContent("Conten:ttrololo");
        mail1.setDate("Date:12.12.12");
        mail1.setSubject("Subject:1");
        save_Mail(mail1);

        Mailer mail2 = new Mailer();
        mail2.setAdressfrom("AdresFrom:fromage");
         mail2.setContent("Conten:majonez");
        mail2.setDate("Date:32.12.132");
        mail2.setSubject("Subject:2");
        save_Mail(mail2);

        Mailer mail3 = new Mailer();
        mail3.setAdressfrom("AdresFrom:3");
        mail3.setContent("Conten:3");
        mail3.setDate("Date:32.12.132");
        mail3.setSubject("Subject:34");
        save_Mail(mail3);
    }

@RequestMapping(value="/mails/mails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Mailer>> getValue(){

    Collection<Mailer> mails = MailMap.values();
    return new ResponseEntity<Collection<Mailer>>(mails, HttpStatus.OK);
    }
}


