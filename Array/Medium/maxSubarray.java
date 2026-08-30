package Array.Medium;

public class maxSubarray {
    public static void printMaxSubarray(int[] arr){
        int n = arr.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        int start = 0;
        int ansStart =-1;
        int ansEnd = -1;
        for(int i =0;i<n;i++){
            
            if(sum ==0){
                start =i;
            }
            sum += arr[i];
            if(sum<0){
                sum =0;
            }
            if(sum> max){
                max = sum;
                ansStart = start;
                ansEnd =i;
            }
        }
        for(int i = ansStart;i<=ansEnd;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
        printMaxSubarray(arr);
    }
    
}
