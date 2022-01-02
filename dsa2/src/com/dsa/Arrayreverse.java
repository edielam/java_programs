package com.dsa;

import java.util.Arrays;

public class Arrayreverse {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        int[] ans = aReverse(arr);

        System.out.println(Arrays.toString(ans));
    }
    static int[] aReverse(int[] brr){
        int a = 0;
        int[] newbrr = new int[brr.length];
        for (int i =brr.length -1; i>= 0; i--){
            newbrr[a] = brr[i];
            a++;
        }
        return newbrr;
    }
}
