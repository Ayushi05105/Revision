package Array.Hard;

public class xorCheck {
    public static int count(int[] arr,int k){
        int cnt =0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            int xor =0;
            for(int j =i;j<n;j++){
                xor ^= arr[j];
                if(xor == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr ={4,2,2,6,4};
        int k =6;
        System.out.println(count(arr, k));
    }
    
}
