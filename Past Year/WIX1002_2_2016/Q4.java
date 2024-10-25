package WIX1002_2_2016;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int n = input.nextInt();

        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        double s = input.nextDouble();

        System.out.printf("The are is: %.2f squared meters.",area(n,s));
    }


    public static double area(int n, double s){
        return ( n * s*s ) / ( 4 * Math.tan(Math.toRadians((double) 180 /n)) );
    }
}
