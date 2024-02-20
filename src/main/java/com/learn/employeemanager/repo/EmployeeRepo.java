package com.learn.employeemanager.repo;

import com.learn.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeByid(Long id);

    Optional<Employee> findEmployeeByid(Long id);
}
