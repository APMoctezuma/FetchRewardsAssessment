package src;

public class Response {
    private boolean result;
    private String reason;

    public Response(boolean result) {
        this.result = result;
        this.reason = "is a valid pyramid word";
    }

    public Response(boolean result, String reason) {
        this.result = result;
        this.reason = reason;
    }

    public boolean getResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
