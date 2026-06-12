package com.taxbridgeai.taxbridgeai.user;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
public class User
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String number;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(){}

    @PrePersist
    protected void onCreate()
    {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();

    }

    @PreUpdate
    protected void onUpdate()
    {
        updatedAt = LocalDateTime.now();
    }

    public Long getId()
    {
        return id;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public String getNumber()
    {
        return number;
    }

    public LocalDateTime getCreatedAt()
    {
        return createdAt;

    }

    public LocalDateTime getUpdatedAt()
    {
        return updatedAt;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setNumber(String number)
    {
        this.number = number;
    }
}