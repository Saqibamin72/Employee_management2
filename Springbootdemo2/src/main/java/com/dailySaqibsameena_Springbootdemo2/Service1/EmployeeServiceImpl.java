package com.dailySaqibsameena_Springbootdemo2.Service1;

import com.dailySaqibsameena_Springbootdemo2.error.EmployeeNotFoundException;
import com.dailySaqibsameena_Springbootdemo2.model1.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    List<Employee>employees=new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if (employee.getEmployeeId() == null||
        employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());


        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees
                .stream()
                .filter(employee -> employee.getEmployeeId().equalsIgnoreCase(id))
                .findFirst()
               // .get();
               // .orElseThrow(()->new EmployeeNotFoundException(" "+"Employee Not found with id"+id));
                .orElseThrow(()->new RuntimeException(" "+"Employee Not Found"+ id));

    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee employee=
                employees
                        .stream()
                        .filter(e ->e.getEmployeeId().equalsIgnoreCase(id) )
                        .findFirst()
                        .get();
                employees.remove(employee);
                return "Employee deleted with id:"+id;

    }


}
