package kamil.services;

import kamil.model.Program;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by k on 18.05.2016.
 */
@Service("ProgramService")
@Transactional
public class ProgramService {

    private static int counter=0;

    private static List<Program> programs = new ArrayList<Program>();


    static {
        programs=insertExamples();

    }


    public void saveProgram(Program program){
        programs.add(program);
    }
    private static List<Program> insertExamples(){
        List<Program> programs = new ArrayList<Program>();
        programs.add(new Program(++counter,"Kamil", "Opis1"));
        programs.add(new Program(++counter,"Tomy", "Opis2"));
        programs.add(new Program(++counter,"Kelly", "Opis3"));
        return programs;
    }

}
