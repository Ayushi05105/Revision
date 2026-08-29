package Basic.Sorting;

public class QuickSort {

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort(int[] arr,int low,int high){
        int n = arr.length;
        if(low<high){
            int partition = helper(arr,low,high);
            sort(arr,low,partition-1);
            sort(arr, partition+1, high);
        }
    }

    public static int helper(int[] arr,int low,int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(arr[i] <= pivot && i<= high-1){
                i++;
            }
            while(arr[j] > pivot && j >=low+1){
                j--;
            }
            if(i<j) swap(arr,i,j);
        }
       swap(arr, low, j);
       return j;
    }
    public static void main(String[] args) {
        int[] arr={5,3,8,4,2,7,1};
        sort(arr, 0, arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    
    
}
