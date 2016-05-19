package kamil.responses;

/**
 * Created by k on 19.05.2016.
 */
public class MailerResponse {


    private boolean resoult;
    private String message;

    public boolean isResoult() {
        return resoult;
    }

    public void setResoult(boolean resoult) {
        this.resoult = resoult;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
