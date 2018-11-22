package com.epam.main;

import java.util.Scanner;

public class Key {
    public  static String generateKey() {
        Scanner scr = new Scanner(System.in);
        System.out.print("Please enter a single key word, without space: ");
        String userInput = scr.next().toUpperCase();
        char[] key = userInput.toCharArray();
        for(char value: key){
            System.out.print(value + ", ");
        }
        return key.toString();
    }
}
