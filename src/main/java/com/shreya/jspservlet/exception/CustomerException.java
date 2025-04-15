package com.shreya.jspservlet.exception;


public class CustomerException extends RuntimeException {
    public CustomerException(String NotAvailable) {

        super(NotAvailable);
    }
}
