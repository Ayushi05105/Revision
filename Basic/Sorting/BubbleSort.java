package Basic.Sorting;

public class BubbleSort {

    public static void sort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={7,1,8,6,2,3};
        sort(arr);
    }
    
}
