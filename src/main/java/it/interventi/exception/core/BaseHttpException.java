package it.interventi.exception.core;

import it.interventi.exception.body.ErrorBody;
import it.interventi.exception.body.ErrorDetail;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.util.Collections;
import java.util.Set;

@Getter
public abstract class BaseHttpException extends BaseRuntimeException {
    private final HttpStatus httpStatus;

    protected BaseHttpException (final HttpStatus httpStatus,
                                 final String id,
                                 final String description) {
        super(id, description);
        this.httpStatus = httpStatus;
    }

    protected BaseHttpException (final HttpStatus httpStatus,
                                 final String id,
                                 final String description,
                                 final Throwable cause) {
        super(id, description, cause);
        this.httpStatus = httpStatus;
    }

    public Set<ErrorDetail> toErrorDetails () {
        final ErrorDetail singleErrorDetail = ErrorDetail.builder()
                .id(getId())
                .description(getMessage())
                .timestamp(getTimestamp())
                .build();
        return Collections.singleton(singleErrorDetail);
    }

    public ErrorBody toErrorBody () {
        return new ErrorBody(toErrorDetails());
    }
}
