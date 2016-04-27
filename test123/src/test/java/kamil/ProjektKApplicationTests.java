package kamil;

import kamil.entities.User;
import kamil.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProjektKApplication.class)
@WebAppConfiguration
public class ProjektKApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void DbTest() {
        User user = new User();
        user.setName("Test");
        user.setSurname("User");
        user.setPassword("abcd");
        String email = "example@mail.com";
        user.setEmail(email);


        userRepository.save(user);

        Long id = user.getId();

        User dbUser = null;
        dbUser = userRepository.findByEmail(email);
        assertNotNull(dbUser);
        System.out.println(dbUser.toString());

        dbUser = null;
        dbUser = userRepository.findOne(id);
        assertNotNull(dbUser);

        assertEquals(dbUser.getEmail(), email);

    }

}
