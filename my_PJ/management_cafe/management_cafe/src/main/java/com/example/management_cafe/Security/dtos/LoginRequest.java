package com.example.management_cafe.Security;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
