package com.example.demosession.repository;

import com.example.demosession.model.State;
import com.example.demosession.model.User;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepo {
    private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<>();

    public User addUser(String fullName, String email, String hashed_pass, State state) {
        String id = UUID.randomUUID().toString();
        User user = User.builder()
                .id(id)
                .fullname(fullName)
                .email(email)
                .hashed_password(hashed_pass)
                .build();
        users.put(id,user);
        return user;

    }
}
