package BinarySearch.OnAnswer;

public class PainterPartition {

    public static int CountPainters(int[] board,int time){
        int painter =1;
        int boardPainter = 0;
        int n = board.length;
        for(int i =0;i<n;i++){
            if(board[i]+boardPainter<=time){
                boardPainter += board[i];
            }
            else{
                painter++;
                boardPainter = board[i];
            }
        }
        return painter;
    }
    public static int MaxPaint(int[] board,int k){
        int n = board.length;
        int sum =0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum += board[i];
            max = Math.max(max,board[i]);
        }
        int low = max;
        int high = sum;
        while(low<= high){
            int mid = (low+high)/2;
            int cnt = CountPainters(board, mid);
            if(cnt>k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] board ={5,5,5,5};
        int k =2;
        System.out.println(MaxPaint(board, k));
    }
    
}
