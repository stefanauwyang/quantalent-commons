package com.quantalent.commons.exception;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BaseExceptionTest {

    @Test
    public void testNewBaseException() {
        // Input
        BaseException exception = new BaseException();

        // Output
        assertTrue(exception instanceof Exception);
    }
}