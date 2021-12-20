package miu;

public class m7 {
    public static void main(String[] args){
        int[] arr = {3, 4, 5, 10};
        System.out.println(poe(arr));

    }
    static int poe(int[] a){
        int i, j, n;
        int leftsum, rightsum;
        n = a.length;
 
        /* Check for indexes one by one until
        an equilibrium index is found */
        for (i = 0; i < n; ++i)
        {    
    
            /* get left sum */
            leftsum = 0;
            for (j = 0; j < i; j++)
                leftsum += a[j];
    
            /* get right sum */
            rightsum = 0;
            for (j = i + 1; j < n; j++)
                rightsum += a[j];
    
            /* if leftsum and rightsum 
            are same, then we are done */
            if (leftsum == rightsum)
                return i;
        }
        return -1;
    }
}
