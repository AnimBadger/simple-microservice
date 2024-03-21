package dev.stephen.student.service;

import dev.stephen.student.model.StudentModel;
import dev.stephen.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository repository;

    //Todo
    // change input to DTO
    // add logics

    public void saveStudent(StudentModel student){
        repository.save(student);
    }

    public List<StudentModel> findAllStudents(){
        return repository.findAll();
    }
}
