package kamil.repositories;

import kamil.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by k on 05.04.16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);

    User findOne(Long id);
}
