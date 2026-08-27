package Basic.BasicMath;
import java.util.*;

public class CountDigit {

    public static int count(int n){
        int cnt =0;
        while(n>0){
            cnt++;
            n = n/10;
        }
        return cnt;
    }

    public static int reverse(int n){
        int rev =0;
        while(n>0){
            int last = n%10;
            rev = rev *10 + last;
            n = n/10;
        }
        return rev;
    }

    public static boolean palindrome(int n){
        if(reverse(n)==n) return true;
        return false;
    }

    public static int gcd(int a,int b){
        while(b!=0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static boolean IsArmstrong(int n){
        int cnt = count(n);
        int num = n;
        int sum =0;
        while(num>0){
            int last = num%10;
            sum += Math.pow(last,cnt);
            num = num/10;
        }
        return sum==n;
    }

    public static ArrayList<Integer> printAllDivisor(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(n);
        while(n>0){
            n = n/2;
            ans.add(n);
        }
        return ans;
    }

    public static boolean prime(int n){
        int cnt =0;
        for(int i =1;i<n;i++){
            if(n %i==0) cnt++;
        }
        return cnt==2;
    }
    public static void main(String[] args) {
        int n = 36;
        System.out.println(count(n));
        System.out.println(reverse(n));
        
        System.out.println(palindrome(n));
        System.out.println(gcd(9, 12));
        System.out.println(IsArmstrong(n));
        System.out.println(printAllDivisor(n));
        System.out.println(prime(n));
    }
}
