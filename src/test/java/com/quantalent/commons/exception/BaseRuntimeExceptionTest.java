package com.quantalent.commons.exception;

import com.quantalent.commons.ErrorCode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseRuntimeExceptionTest {

    @Test
    public void testNewBaseRuntimeException() {
        // Input
        String message = "Insufficient parameter";
        BaseRuntimeException exception = new BaseRuntimeException(ErrorCode.INVALID_PARAM, message);

        // Output
        assertEquals(message, exception.getMessage());
    }

}