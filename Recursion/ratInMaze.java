import java.util.*;

public class ratInMaze {
    public static void rec(int row, int col, int[][] maze, String path, List<String> ans, int n, boolean[][] visited) {
        // base case
        if (row < 0 || col < 0 || row > n || col > n) {
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
        // down
        // left
        // right
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
            rec(maze, 0, 0, " ", ans, n, visited);
        }

    }

}
