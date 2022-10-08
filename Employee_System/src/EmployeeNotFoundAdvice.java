package Employee_System;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class EmployeeNotFoundAdvice {

    @ResponseBody //advice is rendered straight into response body
    @ExceptionHandler(EmployeeNotFoundException.class) //configures the advice to only respond if the Exception is thrown
    @ResponseStatus(HttpStatus.NOT_FOUND) //404
    String employeeNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage(); //returns message
    }
}
