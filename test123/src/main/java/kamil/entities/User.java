package kamil.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by k on 05.04.16.
 */
@Entity
public class User extends AbstractEntity {
    private String name, surname;
    private String password;

    @Column(unique = true)
    @NotNull
    private String email;

  //  private Set<Project> users ;
    public User() {
    }

   /* public User(String surname, Set<Project> users){
    this.surname=surname;
        this.users = users;
    }*/



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  /*  public List<Project> getUsers() {
        return users;
    }

    public void setUsers(List<Project> users) {
        this.users = users;
    }
*/
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
           //     ", users=" + users +
                '}';
    }


}