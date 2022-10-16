package com.employes.models.repo;

import com.employes.models.entities.Employees;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface EmployeesRepo extends CrudRepository<Employees, Long> {
    List<Employees> findByNameContains(String name);
}
