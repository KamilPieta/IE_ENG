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
public String main(){
        return "index";
        }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/test12")
    public String test12(){

        return "index";

    }

   @RequestMapping("/mail")
    public String email(){

        return "mail_composer";

    }

}
