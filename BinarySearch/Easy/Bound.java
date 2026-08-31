package BinarySearch.Easy;

public class Bound {

    public static int lowerBound(int[] arr,int x){
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]>=x){
                return i;
            }
        }
        return -1;
    }
    //optimal

    public static int lowerBound2(int[] arr,int x){
        int n = arr.length;
        int low =0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }

    public static int UpperBound(int[] arr,int x){
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]>x){
                return i;
            }
        }
        return -1;
    }

    public static int UpperBound2(int[] arr,int x){
        int n = arr.length;
        int low =0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid]>x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={3,5,8,9,15,19};
        int x =9;
        System.out.println(lowerBound(arr,x));
        System.out.println(lowerBound2(arr, x));
        System.out.println(UpperBound(arr, x));
        System.out.println(UpperBound2(arr, x));
    }
    
}
