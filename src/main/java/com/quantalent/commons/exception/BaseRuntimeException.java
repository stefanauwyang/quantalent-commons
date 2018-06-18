package com.quantalent.commons.exception;

import com.quantalent.commons.ErrorCode;

public class BaseRuntimeException extends RuntimeException {

    private ErrorCode errorCode;

    public BaseRuntimeException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public BaseRuntimeException(ErrorCode errorCode, String message, Throwable e) {
        super(message, e);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
