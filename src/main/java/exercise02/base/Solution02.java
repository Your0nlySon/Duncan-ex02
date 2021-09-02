package exercise02.base;

    /*
        UCF COP3330 Fall 2021 Assignment 1 Solution
        Copyright 2021 first_name last_name
    */


import java.util.Scanner;

public class Solution02 {

    /*
    create a function called 'stringLen'
    'stringLen': Gets the length of 'userString'
    Print: "'userString' has 'stringLen' characters."

    Print: "What is the input string? "
    'userString': read string from user
    Call function 'stringLen'
     */

    static void stringLen(String userString) {

        int stringLen = userString.length();
        System.out.println(userString + " has " + stringLen + " characters.");

    }

    public static void main(String[] args) {

        System.out.println("What is the input string? ");

        Scanner input = new Scanner(System.in);
        String userString = input.nextLine();
        stringLen(userString);
    }
}
