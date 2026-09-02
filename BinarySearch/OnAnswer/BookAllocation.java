package BinarySearch.OnAnswer;

public class BookAllocation {
    public static int CountStudents(int[] arr,int pages){
        int n = arr.length;
        int student =1;
        int pos = 0;
        for(int i =0;i<n;i++){
            if(pos + arr[i] <= pages){
                pos += arr[i];
            }
            else{
                student++;
                pos = arr[i];
            }
        }
        return student;
    }
    public static int findPages(int[] arr,int n,int m){
        if(m > n) return -1;
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            sum += arr[i];
            max = Math.max(max,arr[i]);
        }
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = (low + high)/2;
            int student = CountStudents(arr, mid);
            if(student > m){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={25,46,28,49,24};
        int m= 4;
        System.out.println(findPages(arr, arr.length-1, m));
    }
    
}
