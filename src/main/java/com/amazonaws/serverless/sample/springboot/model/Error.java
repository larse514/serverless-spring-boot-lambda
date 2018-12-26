package com.amazonaws.serverless.sample.springboot.model;

/**
 * Created by andrewlarsen on 12/24/18.
 */
public class Error {
    private String message;

    public Error(String errorMessage) {
        message = errorMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}