package ajincodew.studentsmanagement.controllers;

import ajincodew.studentsmanagement.entities.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface StudentController {
    @PostMapping
    String addStudent(@RequestBody Student student);

    @GetMapping("/{id}")
    Student retrieveStudent(@PathVariable Long id);

    @GetMapping
    List<Student> retrieveAllStudents();

    @DeleteMapping("/{id}")
    String removeStudent(@PathVariable Long id);
}
