package WIX1002_1_2016;

import java.util.Scanner;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of random integer: ");
        int noOfRandomInt = input.nextInt();

        int[] randomInteger = new int[noOfRandomInt];
        for (int i = 0; i < noOfRandomInt; i++) {
            randomInteger[i] = random.nextInt(1001);
        }

        displayArray(randomInteger);
        displayMaximum(randomInteger);
        displayNearestTenth(randomInteger);
        displayReverseOrderInt(randomInteger);
    }

    public static void displayArray(int[] randomInteger){
        System.out.print("The random integer : ");
        for (int i = 0; i < randomInteger.length; i++) {
            System.out.print(randomInteger[i] + " ");
        }
        System.out.println();
    }

    public static void displayMaximum(int[] randomInteger){
        int maximum = randomInteger[0];
        for (int i = 1; i < randomInteger.length; i++) {
            if(randomInteger[i] > maximum){
                maximum = randomInteger[i];
            }
        }

        System.out.printf("Maximum Number : %d%n", maximum);
    }

    public static void displayNearestTenth(int[] randomInteger){
        System.out.print("The approximation of the integer to the nearest tenth : ");
        for (int i = 0; i < randomInteger.length; i++) {
            if(randomInteger[i] % 10 >= 5){
                System.out.print(randomInteger[i] + 10-(randomInteger[i]%10) + " ");
            } else{
                System.out.print(randomInteger[i] - (randomInteger[i]%10) + " ");
            }
        }
        System.out.println();
    }

    public static void displayReverseOrderInt(int[] randomInteger){
        System.out.print("The random integer in reverse order: ");
        for (int i = 0; i < randomInteger.length; i++) {
            StringBuilder strInt = new StringBuilder().append(randomInteger[i]);
            System.out.print(Integer.parseInt(strInt.reverse().toString()) + " ");
        }
        System.out.println();
    }
}

