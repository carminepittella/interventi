package it.interventi.exception.body;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

import java.time.Instant;
import java.util.Set;

@Value
@AllArgsConstructor
@Builder(toBuilder = true)
@Jacksonized
public class ErrorDetail {

    String id;
    String description;
    Instant timestamp;
    Set<ErrorBody> cause;

}
