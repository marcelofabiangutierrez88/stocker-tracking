/*package unlam.grupo102.StockerTracking.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.UnknownHttpStatusCodeException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import unlam.grupo102.StockerTracking.exception.StockerTrackingException;
import unlam.grupo102.StockerTracking.models.response.ErrorRest;

@ControllerAdvice
public class StockerTrackingControllerAdvice extends ResponseEntityExceptionHandler {
    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<ErrorRest> entityException(WebRequest r, HttpServerErrorException e) {
        ErrorRest errorRest = new ErrorRest()
                .setCode("500")
                .setDescription(e.getLocalizedMessage());
        return new ResponseEntity<>(errorRest, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(HttpClientErrorException.class)
    public ResponseEntity<ErrorRest> clientErrorException(WebRequest r, HttpClientErrorException e) {
        ErrorRest errorRest = new ErrorRest()
                .setCode("500")
                .setDescription(e.getLocalizedMessage());
        return new ResponseEntity<>(errorRest, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnknownHttpStatusCodeException.class)
    public ResponseEntity<ErrorRest> unknownHttpStatusException(WebRequest r, UnknownHttpStatusCodeException e) {
        ErrorRest errorRest = new ErrorRest()
                .setCode("500")
                .setDescription(e.getLocalizedMessage());
        return new ResponseEntity<>(errorRest, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(StockerTrackingException.class)
    public ResponseEntity<StockerTrackingException> stockerException(WebRequest r,
                                                                     StockerTrackingException e)
    {
        StockerTrackingException stockerTrackingException =
                new StockerTrackingException(
                        "500",
                        e.getLocalizedMessage(),
                        HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(stockerTrackingException, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorRest> generalException(WebRequest r, Exception e) {
        ErrorRest errorRest = new ErrorRest()
                .setCode("500")
                .setDescription(e.getLocalizedMessage());
        return new ResponseEntity<>(errorRest, HttpStatus.BAD_REQUEST);
    }

}
*/