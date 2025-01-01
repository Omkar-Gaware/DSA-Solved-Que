public class g_SudokuSolver {
    public static boolean sudokusolver(int sudoku[][], int row, int col) {
        // Base Case
        if (row == 9 && col == 0) {
            return true;
        }
  
        int nxtRow = row, nxtCol = col + 1;
        if (col + 1 == 9) {
            nxtRow = row + 1;
            nxtCol = 0;
        }

        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nxtRow, nxtCol);
        }
        // Recursion
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokusolver(sudoku, nxtRow, nxtCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Col Check
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // Row Check
        for (int i = 0; i <= 8; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // grid
        int Sr = (row / 3) * 3;
        int Sc = (col / 3) * 3;

        for (int i = Sr; i < Sr + 3; i++) {
            for (int j = Sc; j < Sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
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
        if (sudokusolver(sudoku, 0, 0)) {
            System.out.println("Sudoku Exists");
            printSudoku(sudoku);
        }else{
            System.out.println("Sudoku Doesn't exists");
        }
    }
}
