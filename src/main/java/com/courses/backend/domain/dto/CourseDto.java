package com.courses.backend.domain.dto;

import com.courses.backend.domain.entities.Component;

import com.courses.backend.domain.entities.Lecture;
import com.courses.backend.domain.entities.Schedule;

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
public class CourseDto {

    private Long id;

    private String title_sv;

    private String title_en;

    private Instant createdDate;

    private Instant updateDate;

    private List<Component> components;

    private List<Lecture> lectures;

    private Schedule schedule;

}
