package Recursion;
import java.util.*;
public class ratInaMaze {

    static  int[] dr ={1,0,0,-1};
    static  int[] dc ={0,-1,1,0};
    static  char[] dir ={'D','L','R','U'};

    public static void dfs(int[][] maze,int i,int j,String path,List<String> ans,boolean[][] vis){
        int n = maze.length;
        
        if(i<0 ||i>=n || j<0 || j>=n || maze[i][j]==0 || vis[i][j]){
            return;
        }
        if(i== n-1 && j == n-1){
            ans.add(path);
            return;
        }
        vis[i][j] = true;
        for(int row =0;row<4;row++){
            int nr = i + dr[row];
            int nc = j + dc[row];
            dfs(maze, nr, nc, path + dir[row], ans, vis);
        }
        vis[i][j] = false;
    }
    public static List<String> RatInMaze(int[][] maze){
        int n = maze.length;
        List<String> ans = new ArrayList<>();
        if(maze[0][0] ==0 && maze[n-1][n-1]==0){
            return ans;
        }
        
        boolean[][] vis = new boolean[n][n];
        dfs(maze, 0, 0, "", ans, vis);
        return ans;
        
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        
        System.out.println(RatInMaze(maze));
    }
    
}
