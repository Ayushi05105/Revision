package BinarySearch.OnAnswer;

public class NoOfGasStation {

    public static int required(int[] arr, double dist) {
        int n = arr.length;
        
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            int gap = (int)(arr[i]-arr[i-1]);
            int number = (int) (gap / dist);
            if (gap == dist * number) {
                number--;
            }
            cnt += number;
        }
        return cnt;
    }

    public static double GasStation(int[] arr, int k) {
        int n = arr.length;
        double low = 0;
        double high = 0;
        for (int i = 0; i < n-1; i++) {
            high = Math.max(high, arr[i+1] - arr[i]);
        }
        
        while (high - low > 1e-6) {
            double mid = (low + high) / 2;
            int cnt = required(arr, mid);
            if (cnt > k) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        int[] arr={1,13,17,23};
        int k =5;
        System.out.println(GasStation(arr, k));
    }

}
