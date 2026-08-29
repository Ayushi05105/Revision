package Basic.Sorting;

public class InsertionSort {
    public static void sort(int[] arr){
        for(int i =1;i<arr.length;i++){
            int key =arr[i];
            int j =i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={7,4,1,5,3};
        sort(arr);
    }
    
}
