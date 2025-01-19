package it.interventi.exception.core;

import java.time.Instant;

public abstract class BaseRuntimeException extends RuntimeException {
    private final String id;
    private final Instant timestamp;

    protected BaseRuntimeException(final String id,
                                   final String description) {
        super(description);
        this.id = id;
        this.timestamp = Instant.now();
    }

    protected BaseRuntimeException(final String id,
                                   final String description,
                                   final Throwable cause) {
        super(description, cause);
        this.id = id;
        this.timestamp = Instant.now();
    }

    public String getId() {
        return id;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
