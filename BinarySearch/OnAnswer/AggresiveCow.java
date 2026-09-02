package BinarySearch.OnAnswer;

import java.util.Arrays;

public class AggresiveCow {
    public static boolean canPlace(int[] stalls,int cows,int d){
        int cnt =1;
        int lastPos = stalls[0];
        for(int i =1;i<stalls.length;i++){
            if(stalls[i]-lastPos >= d){
                cnt++;
                lastPos = stalls[i];
            }
            if(cnt>= cows) return true;
        }
        return false;
    }
    public static int aggresiveCows(int[] stalls,int cows){
        Arrays.sort(stalls);
        int low =1;
        int high = stalls[stalls.length-1] - stalls[0];
        int ans =0;
        while(low<= high){
            int mid = (low + high)/2;
            if(canPlace(stalls, cows, mid)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] stalls = {1,2,8,4,9};
        int cows = 3;
        System.out.println(aggresiveCows(stalls, cows));
    }
    
}
