package WIX1002_1_2016;

import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int noCompWin = 0;
        int noPlayerWin = 0;

        while (noPlayerWin < 3 && noPlayerWin < 3){
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            int playerMove = input.nextInt();
            int compMove = random.nextInt(3) + 1;  // random choice from 1 to 3

            System.out.printf("Player : %s ----- Computer : %s%n",playerMove,compMove);

            if (playerMove != compMove) { // if not draw
                if (playerMove - compMove == 1 || (playerMove == 1 && compMove == 3)){
                    noPlayerWin++;
                    System.out.printf("Player win %d times(s)%n", noPlayerWin);
                } else if (compMove - playerMove == 1 || (playerMove == 3 && compMove == 1)){
                    noCompWin++;
                    System.out.printf("Computer win %d times(s)%n", noCompWin);
                }
            } else {
                System.out.println("Draw.");
            }

        }

    }
}
