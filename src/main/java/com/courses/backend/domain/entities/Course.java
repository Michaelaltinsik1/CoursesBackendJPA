package com.courses.backend.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true)
    private String title_sv;

    @Column(unique = true)
    private String title_en;

    @CreationTimestamp
    private Instant createdDate;

    @UpdateTimestamp
    private Instant updateDate;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.REMOVE,  orphanRemoval = true)
    private List<Component> components;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course", cascade = CascadeType.REMOVE,  orphanRemoval = true)
    private List<Lecture> lectures;

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "course",cascade = CascadeType.REMOVE,  orphanRemoval = true)
    private Schedule schedule;

}
