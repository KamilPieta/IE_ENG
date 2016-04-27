package kamil.services;

import kamil.entities.User;
import kamil.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

/**
 * Created by k on 05.04.16.
 */

@Transactional
@Service
public class DbService {


    @Autowired
    private UserRepository userRepository;


    @PostConstruct
    public void init() {
        User user = new User();
        user.setEmail("kamil@op.pl");
        user.setName("Kamil");
        user.setSurname("Pieta");
        user.setPassword("abcd");


        userRepository.save(user);

    }
}
