package ajincodew.studentsmanagement.services;

import ajincodew.studentsmanagement.entities.Student;

import java.util.List;

public interface StudentService {
    String addStudent(Student student);
    String updateStudent(Student student);
    String deleteStudent(Long id);
    Student getStudent(Long id);
    List<Student> getAllStudents();
}
