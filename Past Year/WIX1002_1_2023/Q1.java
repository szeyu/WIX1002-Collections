package WIX1002_1_2023;

import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNo = random.nextInt(1001);
        System.out.println("Generated number: " + randomNo);

        StringBuilder str = new StringBuilder().append(randomNo);
        System.out.println("Number in reverse order: " + Integer.parseInt(str.reverse().toString()));

        int sum = 0;
        while (randomNo > 0){
            sum += randomNo % 10;
            randomNo /= 10;
        }
        System.out.println("The sum of all integers: " + sum);
    }
}
