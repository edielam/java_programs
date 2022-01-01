package com.dsa;

import java.util.Scanner;

public class Maxnum {

    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);
        System.out.println("Enter your 3 integers");
        int a = ins.nextInt();
        int b = ins.nextInt();
        int c = ins.nextInt();

        int max = b;
        if (a > max){
            max = a;
        }
        else if(c > max){
            max = c;
        }
        System.out.println(max);
    }
}
