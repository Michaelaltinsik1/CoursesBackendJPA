package com.courses.backend.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String  email;

    private String password;

    private Instant createdDate;

    private Instant updateDate;
}

