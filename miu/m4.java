package miu;

public class m4 {
    public static void main(String[] args){
        int[] b = {};
        System.out.println(centArray(b));
    }
    static int centArray(int[] arr){
        if (arr== null || arr.length % 2 == 0){
            return (0);
        }
        int midIdx = arr.length / 2;
        int midNum = arr[midIdx];
        for (int i=0; i<arr.length; i++){
            if (i != midIdx && midNum >= arr[i] )
                return (0);
        }
        return (1);
    }
}
