package com.chandu.spring.service;

import com.chandu.spring.domain.Employee;
import com.chandu.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
            return employeeRepository.save(employee);
    }
}
