package com.student.studentManagment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<StudentException> handleStudentNotFoundException(
            StudentNotFoundException ex) {

        StudentException studentException = new StudentException(
                ex.getMessage(),
                "STUDENT_NOT_FOUND",
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(studentException, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<StudentException> handleGeneralException(Exception ex) {

        StudentException studentException = new StudentException(
                ex.getMessage(),
                "INTERNAL_SERVER_ERROR",
                HttpStatus.INTERNAL_SERVER_ERROR
        );

        return new ResponseEntity<>(studentException, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
