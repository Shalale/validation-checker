package org.example;

public class InputValidator implements Validator {
    public boolean isValid(String input) {
        String pattern = "^[0-9 ]+$";
        return input.matches(pattern);
    }
}
