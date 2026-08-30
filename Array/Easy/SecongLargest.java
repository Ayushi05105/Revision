package Array.Easy;

public class SecongLargest {

    public static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] >secondMax && arr[i] !=max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static int secondSmallest(int[] arr){
        int min= Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] <secondmin && arr[i] !=min){
                secondmin = arr[i];
            }
        }
        return secondmin;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        System.out.println(secondLargest(arr));
        System.out.println(secondSmallest(arr));

    }
}
