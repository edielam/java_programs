package com.dsa;

public class BinarySearch {
    public static void main(String[] args){
        int[] test = {1,4,5,6,8,9,12,14,16,17,18};
        int target = 16;
        int ans = bs(test,target);
        System.out.println(test[ans]);
    }
    static int bs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }

        }
        return -1;
    }
}
