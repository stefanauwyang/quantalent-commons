package com.quantalent.commons.exception;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BaseRuntimeExceptionTest {

    @Test
    public void testNewBaseRuntimeException() {
        // Input
        BaseRuntimeException exception = new BaseRuntimeException();

        // Output
        assertTrue(exception instanceof RuntimeException);
    }

}