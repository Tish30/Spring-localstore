package com.example.SpringSecurity.Dao.Request;

import com.example.SpringSecurity.Entity.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Signup {

    private String username;
    private String email;
    private String password;
    private String confirmPassword;
    private String location;
}


