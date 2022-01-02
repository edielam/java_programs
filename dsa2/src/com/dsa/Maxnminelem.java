package com.dsa;

public class Maxnminelem {
    public static void main(String[] args) {
        int[] arr = {12,35,6,123,6,4,7,8};
        int ans1 = maxelem(arr);
        int ans2 = minelem(arr);
        System.out.println("Maximum element is : " + ans1);
        System.out.println("Minimum element is : " + ans2);
    }
    static int maxelem(int[] arr){
        int temp = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }
    static int minelem(int[] arr){
        int temp = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i] < temp) {
                temp = arr[i];
            }
        }
        return temp;

    }
}
