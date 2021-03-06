package com.quantalent.commons;

public enum ErrorCode {

    SUCCESS(0, "Success"),
    FAIL(1999, "Fail"),
    INVALID_PARAM(1100, "Invalid Parameter");

    private long code;
    private String description;

    ErrorCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public long getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
