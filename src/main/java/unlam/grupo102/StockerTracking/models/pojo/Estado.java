package unlam.grupo102.StockerTracking.models.pojo;

public class Estado {
    private String value;
    private String message;

    public String getValue() {
        return value;
    }

    public Estado setValue(String value) {
        this.value = value;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Estado setMessage(String message) {
        this.message = message;
        return this;
    }
}
