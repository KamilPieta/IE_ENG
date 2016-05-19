package kamil.model;

/**
 * Created by k on 18.05.2016.
 */
public class Program {
    private long id;
    private String author;
    private String desc;


    public Program(long id,String author,String desc){

        this.id=id;
        this.author=author;
        this.desc=desc;
            }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

     public void setAuthor(String author) {
        this.author = author;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
