package com.quantalent.commons.exception;

import com.quantalent.commons.StatusCode;

public class ValidationException extends BaseRuntimeException {

    public ValidationException(StatusCode statusCode, String message) {
        super(statusCode, message);
    }

    public static void checkNotNull(Object object, StatusCode statusCode, String errorMessage) {
        if (object == null) {
            throw new ValidationException(statusCode, errorMessage);
        }
    }
}
