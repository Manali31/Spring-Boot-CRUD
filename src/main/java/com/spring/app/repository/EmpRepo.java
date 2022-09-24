package com.spring.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.app.entity.Employee;

@Repository
public interface EmpRepo  extends JpaRepository<Employee, Integer>{

}