package com.quantalent.commons.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseRuntimeExceptionTest {

    @Test
    public void testNewBaseRuntimeException() {
        // Input
        String message = "Message";
        BaseRuntimeException exception = new BaseRuntimeException(message);

        // Output
        assertEquals(message, exception.getMessage());
    }

}