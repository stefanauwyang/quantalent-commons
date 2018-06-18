package com.quantalent.commons.exception;

import com.quantalent.commons.ErrorCode;

public class ValidationException extends BaseRuntimeException {

    public ValidationException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public static void checkNotNull(Object object, ErrorCode errorCode, String errorMessage) {
        if (object == null) {
            if (errorMessage == null) {
                throw new ValidationException(errorCode, errorCode.getDescription());
            } else {
                throw new ValidationException(errorCode, errorMessage);
            }
        }
    }
}
