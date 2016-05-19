package kamil.kamilControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by k on 17.05.2016.
 */
@RestController()
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/t1", method = RequestMethod.GET)
    public ResponseEntity<?> test1 (/*@RequestBody String text*/) {
        return new ResponseEntity<>("test", HttpStatus.OK);
    }

}
