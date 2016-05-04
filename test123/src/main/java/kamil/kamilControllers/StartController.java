package kamil.kamilControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by k on 09.04.16.
 */
@Controller
public class StartController {


    @RequestMapping("/home")
    public String test(){

        return "test";

    }

    @RequestMapping("/mail")
    public String email(String text){

        return "mail_composer";

    }

}
