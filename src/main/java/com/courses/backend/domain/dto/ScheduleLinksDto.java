package com.courses.backend.domain.dto;

import com.courses.backend.domain.entities.ScheduleRow;
import com.courses.backend.utils.enums.LinkOptions;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheduleLinksDto {

    private Long id;

    @Enumerated(EnumType.STRING)
    private LinkOptions type;

    private String url;

    private String lectureNameSwe;

    private String lectureNameEn;

    private ScheduleRow scheduleRow;
}
