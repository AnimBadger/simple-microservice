package dev.stephen.student.controller;

import dev.stephen.student.model.StudentModel;
import dev.stephen.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody StudentModel student){
        service.saveStudent(student);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<StudentModel> listAllStudents(){
        return service.findAllStudents();
    }

    @GetMapping("school/{schoolId}")
    @ResponseStatus(HttpStatus.OK)
    public List<StudentModel> listAllStudentsBySchool(@PathVariable Integer schoolId){
        return service.findAllStudentsBySchoolId(schoolId);
    }
}
