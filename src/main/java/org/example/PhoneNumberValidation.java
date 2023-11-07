package org.example;

public class PhoneNumberValidation implements Validator{
    public boolean isValid(String phoneNumber) {
        phoneNumber = EmptySpaceRemover.removeEmptySpace(phoneNumber);

        return phoneNumber.matches("^(69)\\d{8}$") || phoneNumber.matches("^(2)\\d{9}$")
        ||  phoneNumber.matches("^(00302)\\d{9}$") || phoneNumber.matches("^(003069)\\d{8}$");
    }
}
