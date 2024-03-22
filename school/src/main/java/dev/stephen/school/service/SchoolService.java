package dev.stephen.school.service;

import dev.stephen.school.client.StudentClient;
import dev.stephen.school.model.SchoolModel;
import dev.stephen.school.model.response.FullSchoolResponse;
import dev.stephen.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SchoolService {
    private final SchoolRepository repository;
    private final StudentClient studentClient;

    public void saveSchool(SchoolModel school){
        repository.save(school);
    }

    public List<SchoolModel> listSchool(){
        return repository.findAll();
    }

    public FullSchoolResponse findSchoolWithStudent(Integer schoolId) {
        var school = repository.findById(schoolId)
                .orElse(SchoolModel.builder()
                        .schoolName("NOT_FOUND")
                        .email("NOT_FOUND")
                        .build());
        var students = studentClient.findAllStudentsBySchool(schoolId);
        return FullSchoolResponse.builder()
                .schoolName(school.getSchoolName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
