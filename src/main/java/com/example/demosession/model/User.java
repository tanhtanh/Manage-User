package com.example.demosession.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {
    private String id;
    private String fullname;
    private String email;

    private String hashed_password;
    private State state;
}
