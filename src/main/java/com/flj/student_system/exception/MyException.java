package com.flj.student_system.exception;

public class MyException extends RuntimeException {

    private String message;


    public MyException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
