package com.example.payroll;

public class EmployeeNotFound extends RuntimeException{

    public EmployeeNotFound(Long id){
        super("Couldn't find Employee" + id);
    }
}
