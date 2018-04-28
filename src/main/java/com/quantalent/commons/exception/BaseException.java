package com.quantalent.commons.exception;

public class BaseException extends Exception {

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable e) {
        super(message, e);
    }
}
