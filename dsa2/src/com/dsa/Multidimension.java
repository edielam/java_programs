package com.dsa;

import java.util.Arrays;

public class Multidimension {
    public static void main(String[] args) {
        /*
            1   3   2
            1   2   4

            Represent row with i, column with j
            j iterates over each i
         */
        int[][] arr = new int[4][5];
        int num = 3;
        for (int i =0; i < arr.length; i++){
            for (int j=0; j < arr[i].length; j++){
                arr[i][j] = num;
                num++;
            }
        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
