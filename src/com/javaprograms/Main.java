package com.javaprograms;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Data Types
        int myAge = 30;
        int herAge = myAge;
        byte age = 30;
        long viewsCount = 2288839393L;
        long viewC = 27_282_828_282L; //suffix "L" is important
        float price = 10.99F; //suffix 'F' is important
        char letter = 'A'; // single quotes
        boolean isEligible = false;
        Date now = new Date(); // reference type

        // Memory Management difference btn data types
        // reference types to store values, they reference an address
        Point p1 = new Point(1,1);
        Point p2 = p1; //unlike primitive types where p2 and p1 are completely
        // different addresses in memory, so changes in one wont affect
        //the other, this is different with reference types
        p1.x = 2;

        //Strings

        //Arrays
        int[] num = {1, 2, 4, 5};
        System.out.println(num.length);

	    System.out.println(Arrays.toString(num));

        //2D Arrays
        int[][] num2 = {{1,2,3}, {1,2,3}};
        System.out.println(Arrays.deepToString(num2));
        // casting and Implicit casting
    }
}
