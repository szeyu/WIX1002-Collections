package WIX1002_1_2018;

import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;

public class Q4 {
    public static void main(String[] args) {
        double highestScore = 0;
        String winner = "";
        int noPeople = 0;

        try {
            Scanner input = new Scanner(new FileInputStream("src/WIX1002_1_2018/Q4.txt"));

            while (input.hasNextLine()){
                noPeople++;
                String line = input.nextLine();
                String[] result = line.split(",");

                double[] scores = new double[5];
                for (int i = 1; i <= 5; i++) {
                    scores[i-1] = Double.parseDouble(result[i]);
                }

                int degreeOfDifficulty = Integer.parseInt(result[6]);

                double finalScore = getScore(scores, degreeOfDifficulty);
                if(finalScore > highestScore){
                    highestScore = finalScore;
                    winner = result[0];
                }

                System.out.println(result[0] + " score " + finalScore);
            }

        } catch (IOException e){
            System.out.println("Error with file input");
        }

        System.out.println(winner + " is the winner");

    }

    public static double getScore(double[] scores, int degreeOfDifficulty){
        double minimum = scores[0];
        double maximum = scores[0];
        double sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (maximum < scores[i])    maximum = scores[i];
            if (minimum > scores[i])    minimum = scores[i];
        }

        sum -= maximum;
        sum -= minimum;

        return sum * degreeOfDifficulty;
    }
}
