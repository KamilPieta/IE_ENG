package kamil.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by k on 03.05.2016.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mailer {

    private String name;
    //private Integer mailID;
    private String subject;
    private String adressfrom;
    private String content;
    private String date = null;

   // private final String adminAdress="maildoprojektow@gmail.com";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAdressfrom() {
        return adressfrom;
    }

    public void setAdressfrom(String adressfrom) {
        this.adressfrom = adressfrom;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mailer{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", adressfrom='" + adressfrom + '\'' +
                ", content='" + content + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
