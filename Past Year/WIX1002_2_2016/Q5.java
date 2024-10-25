package WIX1002_2_2016;

import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] board = new int[3][3];

        // generate random board
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                board[row][column] = random.nextInt(2);
            }
        }

        // print board
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }

        for (int row = 0; row < 3; row++) {
            if(board[row][0] == board[row][1] && board[row][1] == board[row][2]){
                System.out.println("All " + board[row][0] + "s on row " + (row+1));
            }
        }

        for (int column = 0; column < 3; column++) {
            if(board[0][column] == board[1][column] && board[1][column] == board[2][column]){
                System.out.println("All " + board[0][column] + "s on column " + (column+1));
            }
        }

        if(board[0][0] == board[1][1] && board[1][1] == board[2][2]){
            System.out.println("All " + board[0][0] + "s on \\ diagonal ");
        }
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2]){
            System.out.println("All " + board[0][0] + "s on / diagonal ");
        }
    }
}
