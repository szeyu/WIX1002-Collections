import java.util.*;
public class L04Q05 {
    public static void main(String[] args){
        Random random = new Random();

        int player1Point = 0;
        int player2Point = 0;
        int point;
        
        while(true){
            System.out.println("Current point:");
            System.out.println("Player 1 Point : " + player1Point);
            System.out.println("Player 2 Point : " + player2Point);
            
            do {
                point = random.nextInt(6) + 1;
                player1Point += point;
                System.out.println("Player 1 roll a " + point);
                
                if (player1Point > 100){
                    System.out.println("Player 1 Win the Game!");
                    break;
                }
            } while(point == 6);
            
                         
            if (player1Point > 100 || player2Point > 100){
                break;
            }
            
            
            do {
                point = random.nextInt(6) + 1;
                player2Point += point;
                System.out.println("Player 2 roll a " + point);
                
                if (player2Point > 100){
                    System.out.println("Player 2 Win the Game!");
                    break;
                }
            } while(point == 6);
            if (player1Point > 100 || player2Point > 100){
                break;
            }
        }
        
        System.out.println("Player 1 Point : " + player1Point);
        System.out.println("Player 2 Point : " + player2Point);
    }
}
