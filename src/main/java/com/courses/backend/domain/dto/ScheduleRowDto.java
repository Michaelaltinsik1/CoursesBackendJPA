package com.courses.backend.domain.dto;

import com.courses.backend.domain.entities.Schedule;
import com.courses.backend.domain.entities.ScheduleLinks;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ScheduleRowDto {
    private Long id;

    private LocalDateTime date;

    private String assignments_sv;

    private String assignments_en;

    private String description_sv;

    private String description_en;

    private Instant createdDate;

    private Instant updateDate;

    private List<ScheduleLinks> scheduleLinks;

    private Schedule schedule;
}
