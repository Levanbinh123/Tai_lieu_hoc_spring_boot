package com.example.management_cafe.Entity.dtos;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class Singup {
    private String name;
    private String contactNumber;
    private String email;
    private String password;
}
