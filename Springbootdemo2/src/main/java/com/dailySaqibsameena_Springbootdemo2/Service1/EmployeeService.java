package com.dailySaqibsameena_Springbootdemo2.Service1;

import com.dailySaqibsameena_Springbootdemo2.model1.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);


    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
