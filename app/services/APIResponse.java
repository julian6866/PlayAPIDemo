package services;

/**
 * Created by Julian on 8/3/2016.
 */
public class APIResponse {

    private APIStatus status;

    private Object payload;

    public APIResponse(APIStatus status, Object payload) {
        this.status = status;
        this.payload = payload;
    }

    public APIStatus getStatus() {
        return status;
    }

    public void setStatus(APIStatus status) {
        this.status = status;
    }

    public Object getPayload() { return payload; }

    public void setPayload(Object payload) {
        this.payload = payload;
    }
}
