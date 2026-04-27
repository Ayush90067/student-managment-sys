package com.student.studentManagment.exception;

import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

public class StudentException {

    private final String message;
    private final String error;
    private final HttpStatus status;
    private final LocalDateTime timestamp;

    public StudentException(String message, String error, HttpStatus status) {
        this.message = message;
        this.error = error;
        this.status = status;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}

