package kamil.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by k on 05.04.16.
 */
@Entity
public class Project extends AbstractEntity {
    private String description;
    private String url;


//   private List<User> users = new ArrayList<>();


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

  /*  public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }*/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Project{" +
                "description='" + description + '\'' +
                ", url='" + url + '\'' +
            //    ", users=" + users +
                '}';
    }

   /* @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "book_publisher", joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "publisher_id", referencedColumnName = "id"))
    public Set<Publisher> getPublishers() {
        return publishers;
    }*/
}
