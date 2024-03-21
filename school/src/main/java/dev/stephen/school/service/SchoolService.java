package dev.stephen.school.service;

import dev.stephen.school.model.SchoolModel;
import dev.stephen.school.repository.SchoolRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository repository;

    public void saveSchool(SchoolModel school){
        repository.save(school);
    }

    public List<SchoolModel> listSchool(){
        return repository.findAll();
    }
}
