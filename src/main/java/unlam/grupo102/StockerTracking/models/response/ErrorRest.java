package unlam.grupo102.StockerTracking.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorRest implements Serializable {
    private String code;
    private String description;

    public String getCode() {
        return code;
    }

    public ErrorRest setCode(String code) {
        this.code = code;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ErrorRest setDescription(String description) {
        this.description = description;
        return this;
    }
}
