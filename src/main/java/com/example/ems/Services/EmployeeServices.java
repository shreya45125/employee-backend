package com.example.ems.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ems.Entity.EmployeeEntity;
import com.example.ems.Repository.EmployeeRepository;

@Service
public class EmployeeServices {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeEntity saveEmployee(EmployeeEntity emp) {
        return repository.save(emp);
    }

    public List<EmployeeEntity> getAllEmployees() {
        return repository.findAll();
    }

    public EmployeeEntity getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public EmployeeEntity updateEmployee(EmployeeEntity emp) {
        return repository.save(emp);
    }

    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}





