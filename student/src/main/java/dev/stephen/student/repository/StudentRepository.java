package dev.stephen.student.repository;

import dev.stephen.student.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {
    List<StudentModel> findBySchoolId(Integer schoolId);
}
