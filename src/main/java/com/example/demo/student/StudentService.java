package com.example.demo.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository
                .findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()) {
            throw new IllegalStateException(("Email already chosen."));
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
       boolean exists = studentRepository.existsById(studentId);
       if(!exists) {
           throw new IllegalStateException("Student with id " + studentId + " does not exists.");
       }
       studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, Student updatedStudent) {
        Optional<Student> studentOptional = studentRepository.findById(studentId);
        if(studentOptional.isPresent()) {
            Student existingStudent = studentOptional.get();
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setDateOfBirth(updatedStudent.getDateOfBirth());
            studentRepository.save(existingStudent);
        } else {
            throw new IllegalStateException("Student with id " + studentId + " not found.");
        }
    }
}
