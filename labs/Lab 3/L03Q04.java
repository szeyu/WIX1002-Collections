import java.util.Random;
public class L03Q04 {
    public static void main(String[] args){
        Random random = new Random();
        
        int player1Score = 0;
        int player2Score = 0;
        
        player1Score += random.nextInt(6)+1;
        player1Score += random.nextInt(6)+1;

        player2Score += random.nextInt(6)+1;
        player2Score += random.nextInt(6)+1;
        
        System.out.println("Player 1 Score : " + player1Score);
        System.out.println("Player 2 Score : " + player2Score);
        
        if (player1Score > player2Score)
            System.out.println("Player 1 win");
        else if (player2Score > player1Score)
            System.out.println("Player 2 win");
        else
            System.out.println("Tie");
    }
}
