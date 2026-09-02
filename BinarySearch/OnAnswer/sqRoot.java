package BinarySearch.OnAnswer;

public class sqRoot {

    public static int SquareRoot(int n){
        int ans =0;
        for(int i =1;i<n;i++){
            if(i*i <= n){
                ans = i;
            }
            else{
                break;
            }
        }
        return ans;
    }
    public static int SquareRoot2(int n){
        if(n <2) return n;
        int left =1;
        int right = n/2;
        int ans =0;
        while(left<= right){
            int mid = (left + right)/2;
            if(mid * mid <=n){
                ans = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 36;
        System.out.println(SquareRoot(n));
        System.out.println(SquareRoot2(n));
    }
    
}
