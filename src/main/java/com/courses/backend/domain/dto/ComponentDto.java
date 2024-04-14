package com.courses.backend.domain.dto;

import com.courses.backend.domain.entities.Course;
import com.courses.backend.domain.entities.Lecture;
import com.courses.backend.utils.enums.ComponentsEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComponentDto {
    private Long id;

    @Enumerated(EnumType.STRING)
    private ComponentsEnum type;

    private Instant createdDate;

    private Instant updateDate;

    private Course course;

    private Lecture lecture;
}
