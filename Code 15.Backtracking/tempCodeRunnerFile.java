// public static boolean isSafe(int sudoku[][], int row, int col, int digit){
    //     // Col Check
    //     for (int i = 0; i <= 8; i++) {
    //         if (sudoku[i][col] == digit) {
    //             return false;
    //         }
    //     }
    //     // Row Check
    //     for (int i = 0; i <= 8; i++) {
    //         if (sudoku[row][i] == digit) {
    //             return false;
    //         }
    //     }

    //     //grid
    //     int Sr = (row/3) *3;
    //     int Sc = (col/3) *3;

    //     for(int i=Sr; i<Sr+3; i++){
    //         for(int j =Sc; j< Sc+3; j++){
    //             if (sudoku[i][j] == digit) {
    //                 return false;
    //             }
    //         }
    //     }

    //     return true;
    // }