package com.courses.backend.domain.dto;

import com.courses.backend.domain.entities.Component;
import com.courses.backend.domain.entities.Course;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LectureDto {

    private Long id;

    private String titleSwe;

    private String titleEn;

    private Instant createdDate;

    private Instant updateDate;

    private Course course;

    private List<Component> components;
}
