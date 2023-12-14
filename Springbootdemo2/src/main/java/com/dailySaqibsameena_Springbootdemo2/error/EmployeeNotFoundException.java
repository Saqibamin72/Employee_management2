package com.dailySaqibsameena_Springbootdemo2.error;

public class EmployeeNotFoundException extends  RuntimeException{
    public EmployeeNotFoundException(String message){
        super(message);
    }
}
