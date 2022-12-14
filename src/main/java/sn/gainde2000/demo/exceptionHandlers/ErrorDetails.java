package sn.gainde2000.demo.exceptionHandlers;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;
    private HttpStatus httpStatus;

    public ErrorDetails(Date timestamp, String message, String details, HttpStatus httpStatus) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public ErrorDetails() {
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
                                                                                                                package sn.gainde2000.demo.exceptionHandlers;

import org.springframework.http.HttpStatus;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;
    private HttpStatus httpStatus;

    public ErrorDetails(Date timestamp, String message, String details, HttpStatus httpStatus) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ErrorDetails(Date timestamp, String message, String details) {
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
    }

    public ErrorDetails() {
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
