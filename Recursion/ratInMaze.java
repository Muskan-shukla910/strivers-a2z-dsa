import java.util.*;

public class ratInMaze {
    public static void  rec(int row, int col, int[][] maze, String path, List<String> ans, int n, boolean[][] visited) {
        // base case
        if (row < 0 || col < 0 || row >= n || col >= n) {
            return;
        }
        // next base case(main)
        if (row == n - 1 && col == n - 1) {
            // ans.add(path);
            ans.add(path);
            return;
        }
        // recursion
        visited[row][col] = true;
        // up
        if(row-1>=0 && maze[row-1][col]==1 && !visited[row-1][col]){
            rec(row-1, col, maze, path+"U", ans, n, visited);
        }
        // down
        if(row+1<n && maze[row+1][col]==1 && !visited[row+1][col] ){
            rec(row+1, col, maze, path+"D", ans, n, visited);
        }

        // left
        if(col+1<n && maze[row][col+1]==1 && !visited[row][col+1]){
            rec(row, col+1, maze, path+"L", ans, n, visited);
        }
        // right
        if(col-1>=0 && maze[row][col-1]==1 && !visited[row][col-1]){
            rec(row, col-1, maze, path+"R", ans, n, visited);
        }
        visited[row][col]=false;
    }

    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        // String path="";
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };
        int n = maze.length;
        boolean visited[][] = new boolean[n][n];
        if( maze[0][0] == 1) {
            rec( 0, 0,maze, " ", ans, n, visited);
            // System.out.println(ans);
        }
        System.out.println(ans);

    }

}
