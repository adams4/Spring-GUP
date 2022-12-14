package sn.gainde2000.demo.exceptionHandlers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import sn.gainde2000.demo.business.Users.UtilisateursController;

import java.util.Date;

@RestControllerAdvice(basePackageClasses = UtilisateursController.class)
public class LoginControllerAdvice {

    @ExceptionHandler(BadCredentialsException.class)
    ResponseEntity<ErrorDetails> handleRegistrationException(BadCredentialsException exception, WebRequest request) {

        final ErrorDetails response = new ErrorDetails(new Date(), exception.getMessage(),request.getDescription(false),HttpStatus.UNAUTHORIZED);

        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

}
                                                                              package sn.gainde2000.demo.exceptionHandlers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import sn.gainde2000.demo.business.Users.UtilisateursController;

import java.util.Date;

@RestControllerAdvice(basePackageClasses = UtilisateursController.class)
public class LoginControllerAdvice {

    @ExceptionHandler(BadCredentialsException.class)
    ResponseEntity<ErrorDetails> handleRegistrationException(BadCredentialsException exception, WebRequest request) {

        final ErrorDetails response = new ErrorDetails(new Date(), exception.getMessage(),request.getDescription(false),HttpStatus.UNAUTHORIZED);

        return ResponseEntity.status(response.getHttpStatus()).body(response);
    }

}
