package it.interventi.exception.body;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.util.HashSet;
import java.util.Set;

@Value
@AllArgsConstructor
@Builder
@Jacksonized
public class ErrorBody {

    String version;
    Set<ErrorDetail> errors;

    public ErrorBody (final ErrorDetail errorDetail) {
        this(Set.of(errorDetail));
    }

    public ErrorBody (final ErrorDetail... errors) {
        this(Set.of(errors));
    }

    public ErrorBody (final Set<ErrorDetail> errors) {
        this.version = "v1";
        this.errors = new HashSet<>(errors);
    }
}

