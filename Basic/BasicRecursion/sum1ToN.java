package Basic.BasicRecursion;

import java.util.Arrays;

public class sum1ToN {
    public static int SumNo(int n){
        if(n==1) return n;
        return n + SumNo(n-1);
    }

    public static int factorial(int n){
        if(n ==0) return 1;
        return n * factorial(n-1);
    }

    public static void revArray(int[] arr){
        int i =0;
        int j = arr.length-1;
        if(i ==j || i>j) return ;
        while(j>i){
            int temp =arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr ={2,3,4,5};
        System.out.println(SumNo(n));
        System.out.println(factorial(n));
        revArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
