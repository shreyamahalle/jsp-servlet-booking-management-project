package com.shreya.jspservlet.exception;

public class RestaurantNotFoundException extends RuntimeException {
    public RestaurantNotFoundException(String message) {
        super(message);
    }
}
