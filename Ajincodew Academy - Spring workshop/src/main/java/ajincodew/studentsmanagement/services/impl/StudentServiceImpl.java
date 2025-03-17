package ajincodew.studentsmanagement.services.impl;

import ajincodew.studentsmanagement.entities.Student;
import ajincodew.studentsmanagement.repositories.StudentRepository;
import ajincodew.studentsmanagement.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Override
    public String addStudent(Student student) {
        studentRepository.save(student);
        return "Student added successfully";
    }

    @Override
    public String updateStudent(Student student) {
        return "";
    }

    @Override
    public String deleteStudent(Long id) {
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);
        return "Student deleted successfully";
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
