package com.quantalent.commons;

public enum StatusCode {

    SUCCESS(100, "Success"),
    FAIL(101, "Fail"),
    INVALID_PARAM(102, "Invalid Parameter");

    private long code;
    private String description;

    StatusCode(int code, String description) {
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
