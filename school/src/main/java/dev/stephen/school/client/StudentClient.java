package dev.stephen.school.client;

import dev.stephen.school.model.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "student-service", url = "${application.config.student-url}")
public interface StudentClient {
    @GetMapping("/school/{schoolId}")
    List<Student> findAllStudentsBySchool(@PathVariable Integer schoolId);
}
