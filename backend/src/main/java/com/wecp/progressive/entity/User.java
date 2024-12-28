package com.wecp.progressive.entity;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userId;
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String role;
}