package com.courses.backend.domain.entities;

import com.courses.backend.utils.enums.ComponentsEnum;
import com.courses.backend.utils.enums.LinkOptions;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Blob;
import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "components")
public class Component {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
    private ComponentsEnum type;

    private Blob content;

    @CreationTimestamp
    private Instant createdDate;

    @UpdateTimestamp
    private Instant updateDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

}
