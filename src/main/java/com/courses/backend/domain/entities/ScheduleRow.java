package com.courses.backend.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "schedules_row")
public class ScheduleRow {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    private LocalDateTime date;

    private String assignments_sv;

    private String assignments_en;

    private String description_sv;

    private String description_en;

    @CreationTimestamp
    private Instant createdDate;

    @UpdateTimestamp
    private Instant updateDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "scheduleRow", cascade = CascadeType.REMOVE,  orphanRemoval = true)
    private List<ScheduleLinks> scheduleLinks;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

}
