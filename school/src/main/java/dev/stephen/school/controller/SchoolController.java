package dev.stephen.school.controller;

import dev.stephen.school.model.SchoolModel;
import dev.stephen.school.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveSchool(@RequestBody SchoolModel school){
        service.saveSchool(school);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<SchoolModel> listSchools(){
        return service.listSchool();
    }
}
