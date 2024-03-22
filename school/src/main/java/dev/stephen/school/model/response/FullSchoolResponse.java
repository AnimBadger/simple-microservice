package dev.stephen.school.model.response;

import dev.stephen.school.model.Student;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FullSchoolResponse {
    private String schoolName;
    private String email;
    List<Student> students;
}
