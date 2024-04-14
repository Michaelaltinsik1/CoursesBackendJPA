package com.courses.backend.domain.entities;

import com.courses.backend.utils.enums.LinkOptions;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "schedule_links")
public class ScheduleLinks {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
    private LinkOptions type;

    private String url;

    private String lectureNameSwe;
    private String lectureNameEn;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "schedule_row_id")
   private ScheduleRow scheduleRow;

}
