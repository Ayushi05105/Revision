package Basic.Sorting;

public class SelectionSort {

    public static void sort(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3};
        
        sort(arr);
        
       
    }
}
