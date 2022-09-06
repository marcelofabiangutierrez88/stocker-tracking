package unlam.grupo102.StockerTracking.exception;

import org.springframework.http.HttpStatus;

public class StockerTrackingException extends RuntimeException{
    HttpStatus httpStatus;
    private String code;

    public StockerTrackingException(String message, String code, HttpStatus httpStatus) {
        super(message);
        this.code = code;
        this.httpStatus = httpStatus;
    }


}
