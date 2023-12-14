package com.dailySaqibsameena_Springbootdemo2.model1;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//@JsonIgnoreProperties({"department","lastName"})
@JsonIgnoreProperties({"department"})
public class Employee {
    private String firstName;
    private  String lastName;
    private String employeeId;
    private String emailId;
   // @JsonIgnore for particular
    private String department;

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
