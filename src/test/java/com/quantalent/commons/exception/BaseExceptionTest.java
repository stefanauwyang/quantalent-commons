package com.quantalent.commons.exception;

import com.quantalent.commons.ErrorCode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseExceptionTest {

    @Test
    public void testNewBaseException() {
        // Input
        String message = "Insufficient parameter";
        BaseException exception = new BaseException(ErrorCode.INVALID_PARAM, message);

        // Output
        assertEquals(message, exception.getMessage());
    }
}