package com.dsa;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5};
        int[] newer = swap(arr, 1, 3);
        System.out.println(Arrays.toString(newer));
    }
    static int[] swap(int[] brr, int idx1, int idx2){
        int temp = brr[idx1];
        brr[idx1] = brr[idx2];
        brr[idx2] = temp;

        return brr;
    }
}
