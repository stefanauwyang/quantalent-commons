package com.quantalent.commons.exception;

import com.quantalent.commons.StatusCode;

public class BaseException extends Exception {

    private StatusCode statusCode;

    /**
     * Use BaseException(StatusCode statusCode, String message) instead.
     *
     * @param message message about this exception
     */
    @Deprecated
    public BaseException(String message) {
        super(message);
    }

    /**
     * Use BaseException(StatusCode statusCode, String message, Throwable e) instead.
     *
     * @param message message about this exception
     */
    @Deprecated
    public BaseException(String message, Throwable e) {
        super(message, e);
    }

    public BaseException(StatusCode statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public BaseException(StatusCode statusCode, String message, Throwable e) {
        super(message, e);
        this.statusCode = statusCode;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

}
