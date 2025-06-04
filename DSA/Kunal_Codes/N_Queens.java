package Kunal_Codes;

public class N_Queens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println( queens(board, 0));
    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) { //base case: all queens have been placed successfully
            display(board);
            System.out.println(); // just to differentiate the answers
            return 1;
        }

        int count = 0; //counting all the possible variations

        //placing the queen and checking all the rows and columns
        for(int col = 0; col < board.length; col++) {  // try placing a queen in each column of the current row
            //checking if the position is valid for the queen
            if(isSafe(board, row, col)){
                board[row][col] = true; // if valid position then it is marked as true
                count  = count + queens(board, row + 1); // count and again method called to the next row

                // backtrack: remove the queen to explore other column placements in this row
                board[row][col] = false;
            }
        }

        return count;
    }

    //
    static boolean isSafe(boolean[][] board, int row, int col) {
        //vertical check
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        //left diagonal check
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft ; i++) {
            if (board[row-i][col-i]) {
                return false;
            }
        }

        //right diagonal check
        int maxRight = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxRight ; i++) {
            if (board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    //display function to display the board
    static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row ){
                if (element){
                    System.out.print(" Q ");
                } else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }
}