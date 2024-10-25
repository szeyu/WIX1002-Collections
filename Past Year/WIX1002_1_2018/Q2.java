package WIX1002_1_2018;

import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int groupAAA = 0, groupAA = 0, groupA = 0;

        System.out.print("Enter N number: ");
        int N = input.nextInt();

        System.out.print("The random numbers are: ");

        for (int i = 0; i < N; i++) {
            int randomNo = random.nextInt(101) + 50;
            System.out.print(randomNo + " ");
            int lastDigit = randomNo % 10;
            if(lastDigit <=3)
                groupAAA++;
            else if (lastDigit <= 6)
                groupAA++;
            else
                groupA++;
        }
        System.out.println();
        System.out.printf("Group AAA : %d%n", groupAAA);
        System.out.printf("Group AA : %d%n", groupAA);
        System.out.printf("Group A : %d%n", groupA);
    }
}
