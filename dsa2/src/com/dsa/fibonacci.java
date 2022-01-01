package com.dsa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int sum = 0;
        System.out.println("Enter the nth index: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        for (int i =2; i <= n; i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
    }
}
