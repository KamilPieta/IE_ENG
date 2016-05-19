package kamil.kamilControllers;


import kamil.services.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * Created by k on 03.05.2016.
 */

@RestController
@RequestMapping("/program")
public class ProgramRestController {


    @Autowired
    ProgramService programService;



}