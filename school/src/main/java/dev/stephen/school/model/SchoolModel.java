package dev.stephen.school.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolModel {
    @Id
    private Integer schoolId;
    private String schoolName;
    private String email;
}
