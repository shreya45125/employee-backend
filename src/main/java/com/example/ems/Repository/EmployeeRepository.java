package com.example.ems.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems.Entity.EmployeeEntity;


public interface  EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{

}
