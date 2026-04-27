public class sudokuSolver {
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // row check
        for (int j = 0; j < 8; j++) {
            if (sudoku[row][j] == digit)
                return false;
        }
        // col check
        for (int i = 0; i < 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // grid check
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = 0; i < startRow+3; i++) {
            for (int j = 0; j < startCol+3; j++) {
                if (sudoku[startRow][startCol] == digit) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean mySudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9 && col == 0) {
            return true;
        } 
        // else if (row == 9) {
            // return false;
        // }
        // recursion
        int nextRow = row;
        int nextCOl = col + 1;
        if (col == 9) {
            nextRow = row + 1;
            nextCOl = 0;
        }
        // Already set elements (just checking)
        if (sudoku[row][col] != 0) {
            return mySudokuSolver(sudoku, nextRow, nextCOl);
        }
        // Placing new elements(if zero)
        for (int digit = 1; digit <= 8; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (mySudokuSolver(sudoku, nextRow, nextCOl)) {
                    // true
                    // Solution exist
                    return true;
                }
                sudoku[row][col] = 0;

            }
        }
        // everthing is safe you can place anywhere
        return false;
    }

    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.println(sudoku[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (mySudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists");
            printSudoku(sudoku);

        } else {
            System.out.println("Solutuiom does not exists");
        }

    }
}
