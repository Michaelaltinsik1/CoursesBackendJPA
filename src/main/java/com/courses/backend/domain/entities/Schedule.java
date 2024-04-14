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
@Table(name = "schedules")
public class Schedule {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    @CreationTimestamp
    private Instant createdDate;

    @UpdateTimestamp
    private Instant updateDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "schedule", cascade = CascadeType.REMOVE,  orphanRemoval = true)
    private List<ScheduleRow> scheduleRows;

    @OneToOne
    @JoinColumn(name = "course_id")
    private Course course;
}
