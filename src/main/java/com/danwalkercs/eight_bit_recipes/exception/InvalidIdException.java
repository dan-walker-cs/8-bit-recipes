package com.danwalkercs.eight_bit_recipes.exception;

public class InvalidIdException extends RuntimeException {

    public InvalidIdException() {
        super();
    }

    public InvalidIdException(long id) {
        super("No record exists with id: " + id);
    }
}
