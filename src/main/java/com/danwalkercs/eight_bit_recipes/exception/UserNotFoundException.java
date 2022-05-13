package com.danwalkercs.eight_bit_recipes.exception;

public class UserNotFoundException extends RuntimeException {

    UserNotFoundException() {
        super();
    }

    public UserNotFoundException(String msg) {
        super(msg);
    }
}
