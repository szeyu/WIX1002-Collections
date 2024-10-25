package WIX1002_2_2016;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pound = input.nextDouble();
        double kilograms = pound * 0.454;
        System.out.println(pound + " pounds is " + kilograms + " kilograms");
    }
}
