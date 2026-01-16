
package com.example.ems.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.Entity.EmployeeEntity;
import com.example.ems.Services.EmployeeServices;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServices service;

    @PostMapping
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity emp) {
        return service.saveEmployee(emp);
    }

    @GetMapping
    public List<EmployeeEntity> getEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployee(@PathVariable Long id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public EmployeeEntity updateEmployee(@PathVariable Long id, @RequestBody EmployeeEntity emp) {
        emp.setId(id);
        return service.updateEmployee(emp);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        service.deleteEmployee(id);
    }
}


