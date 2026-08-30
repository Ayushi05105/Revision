package Array.Easy;

public class missingNo {

    public static int Missing(int[] arr){
        int sum =0;
        int n = arr.length+1;
        for(int i =0;i<arr.length;i++){
            sum +=arr[i];
        }
        int sumTotal = n *(n+1)/2;
        return sumTotal - sum;
    }

    public static void main(String[] args) {
        int[] arr = {8,2,4,5,3,7,1};
        System.out.println(Missing(arr));
    }
    
}
