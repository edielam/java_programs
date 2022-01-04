public class Main {
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
        int mid = start + (end - start)/2;
        if (arr.length == 0){
            return -1;
        }
        for(; pivot < arr.length; pivot++) {
            if (arr[pivot] > arr[mid - 1] && arr[pivot] > arr[mid + 1]) {
                mid = pivot;
            }

        while(start <= end){
            
            }
            if(target < mid){
                end = mid -1;
            }
            else if (target > mid){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
