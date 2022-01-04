package com.dsa;

public class RotatedSortedArray {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,6,7,0,1};
        int target = 0;
        int ans = rsa(arr, target);
        System.out.println(ans);
    }

    static int rsa(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int pivot = 0;
        int mid1 = 0;


        for(; pivot < arr.length; pivot++) {
            if (arr[pivot] > arr[mid1 + 1] ) {
                mid1 = pivot;
            }
        }

        while(start <= end){
            if(target < arr[mid1]){
                end = mid1 -1;
                mid1 = start + (end - start)/2;
            }
            else if (target > arr[mid1]){
                start = mid1 + 1;
                mid1 = start + (end - start)/2;
            }
            else {
                return mid1;
            }


        }
        return mid1;
    }
}
