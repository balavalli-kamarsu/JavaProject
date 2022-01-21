package com.ExceptionHandling.CustomExceptions;

public class UserDefinedExceptions {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        marriageAge("8");
    }

    public static void marriageAge(String s) {
        int age = Integer.parseInt(s);
         if (age < 18) {
            throw new TooYoungException("Your age is not appropriate for marriage age.");
        }else {
            System.out.println("Appropriate age for marriage.");
        }
    }
}
