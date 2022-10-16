package com.employes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employes.models.entities.Employees;
import com.employes.services.EmployeesService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/users")
public class EmployeesController {

    @Autowired
    private EmployeesService employeesService;

    @PostMapping
    public Employees save(@RequestBody Employees employees) {
        return employeesService.save(employees);
    }

    @GetMapping("{id}")
    public Employees findOne(@PathVariable("id") Long id) {
        return employeesService.findOne(id);
    }

    @PatchMapping
    public Employees update(@RequestBody Employees employees) {
        return employeesService.save(employees);
    }

    @DeleteMapping("{id}")
    public void removeOne(@PathVariable("id") Long id) {
        employeesService.removeOne(id);
    }

    @GetMapping
    public Iterable<Employees> findAll() {
        return employeesService.findAll();

    }
}
