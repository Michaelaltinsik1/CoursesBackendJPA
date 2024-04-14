package com.courses.backend.domain.dto;

import com.courses.backend.domain.entities.Course;
import com.courses.backend.domain.entities.ScheduleRow;

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
public class ScheduleDto {
    private Long id;

    private Instant createdDate;

    private Instant updateDate;

    private List<ScheduleRow> scheduleRows;

    private Course course;
}
