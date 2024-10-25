package WIX1002_2_2017;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] randomInt = new int[n];

        for (int i = 0; i < n; i++) {
            randomInt[i] = new Random().nextInt(10001);
        }

        displayAll(randomInt);
        System.out.println("Min: " + getMin(randomInt));
        displayApproximationToNearestHundred(randomInt);
        displayReverse(randomInt);
    }

    public static void displayAll(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int getMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min > array[i])
                min = array[i];
        }
        return min;
    }

    public static void displayApproximationToNearestHundred(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 100 / 10 < 5)
                System.out.print((array[i] - array[i]%100) + " ");
            else
                System.out.print((array[i] + 100 - array[i]%100) + " ");
        }
        System.out.println();
    }

    public static void displayReverse(int[] array){
        for (int i = 0; i < array.length; i++) {
            StringBuilder str = new StringBuilder();
            str.append(array[i]);

            System.out.print(Integer.parseInt(str.reverse().toString()) + " ");
        }
        System.out.println();
    }
}
