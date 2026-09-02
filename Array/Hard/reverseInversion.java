package Array.Hard;

public class reverseInversion {


    public static int reverse(int[] arr,int low,int mid,int high){
        int right = mid+1;
        int cnt =0;
        for(int i =low;i<=mid;i++){
            if(right<= high && arr[low]> 2* arr[right]){
                right++;
            }
            cnt += right -(mid+1);
        }
        return cnt;
    }
    
}
