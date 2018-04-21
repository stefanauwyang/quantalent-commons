package com.quantalent.commons.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseExceptionTest {

    @Test
    public void testNewBaseException() {
        // Input
        String message = "Message";
        BaseException exception = new BaseException(message);

        // Output
        assertEquals(message, exception.getMessage());
    }
}