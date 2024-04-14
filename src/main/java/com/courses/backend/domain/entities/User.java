package com.courses.backend.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String  email;

    private String password;

    @CreationTimestamp
    private Instant createdDate;

    @UpdateTimestamp
    private Instant updateDate;
}
