package org.example;

import java.util.List;

public class Output {

    PhoneNumberValidation validation = new PhoneNumberValidation();
    public void simpleValidationOutput(String phoneNumber){
        boolean isValid = validation.isValid(phoneNumber);
        String numberWithoutSpaces = EmptySpaceRemover.removeEmptySpace(phoneNumber);

        System.out.println(numberWithoutSpaces + "     [phone number: " + ( isValid ? "VALID" : "INVALID") + "]");
    }
}
