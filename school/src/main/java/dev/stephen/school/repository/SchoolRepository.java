package dev.stephen.school.repository;

import dev.stephen.school.model.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<SchoolModel, Integer> {
}
