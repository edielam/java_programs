package com.dsa;

public class Reverse {
    public static void main(String[] args) {
        int test = 9971;
        int newdig = 0;
        while (test > 0){
            int dig = test % 10;
            test = test / 10;
            newdig = (newdig * 10) + dig;
        }
        System.out.println(newdig);
    }
}
