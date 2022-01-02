package com.dsa;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>(3);

        myArray.add("Ed");
        myArray.add("Jojo");
        Scanner dat = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String dat2 = dat.next();

        for(char i =65; i< 75; i++){
            myArray.add(dat2 +"_"+ i);
        }
        System.out.println(myArray);
    }
}
