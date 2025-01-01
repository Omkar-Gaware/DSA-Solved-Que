public class d_NQueens {
    public static boolean isSafe(char board[][], int row, int col){
        // verticle Up
        for (int i = row-1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Diagonal Left Up
        for (int i = row-1, j =col-1 ; i >= 0 && j>=0; i--,j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // Diagonal Right Up
        for (int i = row-1, j =col+1 ; i >= 0 && j<board.length; i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    public static int count = 0;
    public static void nQueens(char board[][], int row) {
        // base
        if (row == board.length) {
            printQueens(board);
            count++;
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X';
            }
        }
    }
    // public static boolean nQueensOne(char board[][], int row) {
    //     // base
    //     if (row == board.length) {
    //         // printQueens(board);
    //         count++;
    //         return true;
    //     }
    //     // column loop
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             if(nQueensOne(board, row + 1)){
    //                 return true;
    //             };
    //             board[row][j] = 'X';
    //         }
    //     }
    //     return false;
    // }

    public static void printQueens(char board[][]) {
        System.out.println("--------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }
        //nQueensOne(board, 0);
        nQueens(board, 0);
        System.out.println("No of Possible Solutions Are :"+count);
        
    }
}