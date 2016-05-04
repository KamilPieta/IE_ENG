package kamil.services;

import kamil.model.User;

import java.util.List;

/**
 * Created by k on 03.05.2016.
 */
public interface UserService {

    User findById(long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserById(long id);

    List<User> findAllUsers();

    void deleteAllUsers();

    public boolean isUserExist(User user);

}
