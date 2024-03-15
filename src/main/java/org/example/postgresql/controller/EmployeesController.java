package org.example.postgresql.controller;

import org.example.postgresql.model.Employees;
import org.example.postgresql.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8082")
@RequestMapping("/employees")
@RestController
public class EmployeesController {

    @Autowired
    private EmployeesRepository empRepo;

    @PostMapping("/addEmployyer")
    public Employees addUser(@RequestBody Employees employer) {
        return empRepo.save(employer);
    }

    @GetMapping("/getAllEmployer")
    public List<Employees> getAllUser(){
        return empRepo.findAll();
    }
    @DeleteMapping("/deleteEmployer/{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        empRepo.deleteById(id);
    }
}
