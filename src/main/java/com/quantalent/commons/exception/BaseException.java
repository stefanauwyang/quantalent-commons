package com.quantalent.commons.exception;

import com.quantalent.commons.ErrorCode;

public class BaseException extends Exception {

    private ErrorCode errorCode;

    public BaseException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public BaseException(ErrorCode errorCode, String message, Throwable e) {
        super(message, e);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
