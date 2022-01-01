package com.dsa;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner chi = new Scanner(System.in);
        System.out.println("Enter a string: ");
        char ch = chi.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }
        else {
            System.out.println("Not a letter");
        }
    }
}
