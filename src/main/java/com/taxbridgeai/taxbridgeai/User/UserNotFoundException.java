package com.taxbridgeai.taxbridgeai.user;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id)
    {
        super("User with id "+id+" does not exists.");
    }

    public UserNotFoundException(String email)
    {
        super("User with email "+email+" does not exists.");
    }
}