package org.example;

public class EmptySpaceRemover {
    public static String removeEmptySpace(String phoneNumber){
        return phoneNumber.replaceAll(" ", "");
    }
}
