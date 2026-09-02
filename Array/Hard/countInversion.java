package Array.Hard;
public class countInversion {

    public static int merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high - low+ 1];
        int k =0;
        int left = low;
        int right = mid+1;
        int cnt =0;
        while(left <= mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[k++] = arr[left++];
            }
            else{
                temp[k++] = arr[right++];
                cnt +=(mid-left+1);
            }
        }
        while(left<=mid){
            temp[k++] = arr[left++];
        }
        while(right <= high){
            temp[k++] = arr[right++];
        }
        for(int i =low;i<=high;i++){
            arr[i] = temp[i-low];
        }
        return cnt;
    }

    public static int mergeSort(int[] arr,int low,int high){
        int mid = (low+high)/2;
        
        int cnt =0;
        if(low>= high) return cnt;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid+1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    public static int inversion(int[] arr){
        return mergeSort(arr, 0, arr.length-1);
    }

    
    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};
        System.out.println(inversion(arr));
    }
    
}
