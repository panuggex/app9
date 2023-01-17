package com.app9.app9.exeption;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(long userId) {
        super("User not found with id " + userId);
    }
}