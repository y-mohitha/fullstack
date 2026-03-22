package com.example.myfirstproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.myfirstproject.model.Student;
import com.example.myfirstproject.repository.StudentRepository;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository repo;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return repo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return repo.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id){
        repo.deleteById(id);
        return "Deleted";
    }
}