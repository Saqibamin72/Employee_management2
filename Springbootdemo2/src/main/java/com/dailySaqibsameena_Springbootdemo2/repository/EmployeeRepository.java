package com.dailySaqibsameena_Springbootdemo2.repository;

import com.dailySaqibsameena_Springbootdemo2.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,String> {
}
