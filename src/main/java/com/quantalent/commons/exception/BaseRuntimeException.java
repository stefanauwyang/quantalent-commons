package com.quantalent.commons.exception;

import com.quantalent.commons.StatusCode;

public class BaseRuntimeException extends RuntimeException {

    private StatusCode statusCode;

    /**
     * Use BaseRuntimeException(StatusCode statusCode, String message) instead.
     *
     * @param message
     */
    @Deprecated
    public BaseRuntimeException(String message) {
        super(message);
    }

    /**
     * Use BaseRuntimeException(StatusCode statusCode, String message, Throwable e) instead.
     *
     * @param message
     */
    @Deprecated
    public BaseRuntimeException(String message, Throwable e) {
        super(message, e);
    }

    public BaseRuntimeException(StatusCode statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public BaseRuntimeException(StatusCode statusCode, String message, Throwable e) {
        super(message, e);
        this.statusCode = statusCode;
    }
}
