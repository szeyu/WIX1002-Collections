package WIX1002_2_2016;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int noLine = input.nextInt();

        for (int i = 1; i <= noLine; i++) {
            for (int j = 0; j < noLine-i; j++) {
                System.out.print("  ");
            }

            System.out.print(i + " ");
            for (int j = i -1; j > 1 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                if(i == 1)
                    break;
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
