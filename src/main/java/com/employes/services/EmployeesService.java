package com.employes.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employes.models.entities.Employees;
import com.employes.models.repo.EmployeesRepo;

@Service
@Transactional
public class EmployeesService {

    @Autowired
    private EmployeesRepo employeesRepo;

    public Employees save(Employees Employee) {
        return employeesRepo.save(Employee);
    }

    public Employees findOne(Long id) {
        Optional<Employees> employee = employeesRepo.findById(id);
        if (!employee.isPresent()) {
            return null;
        } else {
            return employee.get();
        }
    }

    public Iterable<Employees> findAll() {
        return employeesRepo.findAll();

    }

    public void removeOne(Long id) {
        employeesRepo.deleteById(id);
    }

    public List<Employees> findByName(String name) {
        return employeesRepo.findByNameContains(name);
    }
}
