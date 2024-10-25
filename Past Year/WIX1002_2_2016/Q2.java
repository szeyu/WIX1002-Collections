package WIX1002_2_2016;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int sumOfDigit = 0;
        while (number != 0){
            sumOfDigit += number % 10;
            number /= 10;
        }

        System.out.println("The sum of the digits is " + sumOfDigit);
    }
}
