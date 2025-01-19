package it.interventi.exception.handler;

import it.interventi.exception.body.ErrorBody;
import it.interventi.exception.core.BaseHttpException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalControllerAdvice {
    @ExceptionHandler(BaseHttpException.class)
    public <T extends BaseHttpException> ResponseEntity<ErrorBody> handleMultipleException (T ex) {
        ErrorBody errorBody = ex.toErrorBody();
        return new ResponseEntity<>(errorBody, ex.getHttpStatus());
    }
}