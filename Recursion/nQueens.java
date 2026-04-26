public class nQueens {

    public static void main(String[] args) {

        // Important 
        // Jaha pr humloop chala rhe hai baha i and j and jaha pr hum only 
        // position check kr rhe hai baha prr hume row and col use krenge 
        int n = 4;
        char[][] board = new char[n][n];
        // Intialize board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '.';
                // System.out.print(board[i][j]);
            }
        }
        placeQueens(board, 0);

    }

    public static void placeQueens(char[][] board, int row) {

        if(board.length==row){
            // After print Board back 
            printBoard(board);
            System.out.println("new way");
            return;
        }

        // place queens in each row 
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row,col)) {
                board[row][col] = 'Q';
                // Recursive call
                placeQueens(board, row + 1);
                // backtrack
                board[row][col] = '.';
            }
        }

    }
    // public static void isSafe(board,row){

    // }
    public static boolean isSafe(char [][] board,int row,int col){
        // vertically  check
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }

        }
        // left upper diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // right upper diagonal 
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j]=='Q'){
                return false;
            }
        }

        // If saare paths sahi hai 
        return true;
    }
    public static void printBoard(char [][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print("--"+ board[i][j]);
                
            }
            System.out.println();
        }
    }
}