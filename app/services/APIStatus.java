package services;

/**
 * Created by Julian on 8/3/2016.
 */
public class APIStatus {

    private String code = "-1";

    private String message = "";

    public APIStatus(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() { return message; }

    public void setMessage(String message) {
        this.message = message;
    }

}
