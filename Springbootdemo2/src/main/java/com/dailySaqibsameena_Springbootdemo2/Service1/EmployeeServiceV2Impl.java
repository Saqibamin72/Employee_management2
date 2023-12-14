package com.dailySaqibsameena_Springbootdemo2.Service1;

import com.dailySaqibsameena_Springbootdemo2.entity.EmployeeEntity;
import com.dailySaqibsameena_Springbootdemo2.model1.Employee;
import com.dailySaqibsameena_Springbootdemo2.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceV2Impl implements EmployeeService{
    @Autowired
private EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee employee)  {
        if(employee.getEmployeeId()==null||employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        EmployeeEntity entity=new EmployeeEntity();
        BeanUtils.copyProperties(employee,entity);
        employeeRepository.save(entity);
        return employee;

    }

    @Override
    public List<Employee> getAllEmployees() {
            List<EmployeeEntity> employeeEntityList
                    =employeeRepository.findAll();
            List<Employee> employees=employeeEntityList
                    .stream()
                    .map(employeeEntity->{
                        Employee employee=new Employee();
                        BeanUtils.copyProperties(employeeEntity,employee);
                        return employee;
                    })
                    .collect(Collectors.toList());
            return employees;
        }


    @Override
    public Employee getEmployeeById(String id) { EmployeeEntity employeeEntity=employeeRepository.findById(id).get();
            Employee employee=new Employee();
            BeanUtils.copyProperties(employeeEntity,employee);
            return  employee;

    }

    @Override
    public String deleteEmployeeById(String id) {
            employeeRepository.deleteById(id);
            return "Employee deleted with id"+id;
        }


}
