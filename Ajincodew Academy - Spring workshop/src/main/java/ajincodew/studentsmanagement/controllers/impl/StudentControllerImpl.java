package ajincodew.studentsmanagement.controllers.impl;

import ajincodew.studentsmanagement.controllers.StudentController;
import ajincodew.studentsmanagement.entities.Student;
import ajincodew.studentsmanagement.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/v1/students")
@RestController
@AllArgsConstructor
public class StudentControllerImpl implements StudentController {
    private StudentService studentService;

    @Override
    public String addStudent(Student student) {
        return studentService.addStudent(student);
    }

    @Override
    public Student retrieveStudent(Long id) {
        return studentService.getStudent(id);
    }

    @Override
    public List<Student> retrieveAllStudents() {
        return studentService.getAllStudents();
    }

    @Override
    public String removeStudent(Long id) {
        return studentService.deleteStudent(id);
    }
}
