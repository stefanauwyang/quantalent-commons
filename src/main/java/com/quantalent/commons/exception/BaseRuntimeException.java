package com.quantalent.commons.exception;

public class BaseRuntimeException extends RuntimeException {

    public BaseRuntimeException(String message) {
        super(message);
    }

    public BaseRuntimeException(String message, Throwable e) {
        super(message, e);
    }
}
