package Array.Hard;

public class RepetingMissingNo {
    public static int[] findRepeting_MissingNo(int[] arr){
        int n = arr.length;
        int[] freq = new int[n+1];
        for(int i =0;i<n;i++){
            freq[arr[i]]++;
        }
        int missing = -1;
        int repeating = -1;
        for(int i =1;i<=n;i++){
            if(freq[i]==0){
                missing =i;
            }
            else if(freq[i]==2){
                repeating = i;
            }

            if(repeating !=-1 && missing!=-1){
                break;
            }
        }
        return new int[]{missing,repeating};
    }
    public static void main(String[] args) {
        int[] arr={3,5,4,1,1};
        int[] ans = findRepeting_MissingNo(arr);
        System.out.println(ans[0] +" "+ ans[1]);
    }
}
