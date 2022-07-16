package com.example.pojo;

import com.example.models.Role;

import java.util.List;

public class JwtResponse {
    private String token;
    private Long id;
    private String type="Bearer";
    private String username;
    private String password;
    private String email;
    private List<String> roles;

    public JwtResponse(String username, String password, String email, List<String> roles,String token, Long id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.roles = roles;
        this.token = token;
        this.id = id;
    }

    public JwtResponse(String jwt, Long id, String username, String email, List<String> roles) {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
