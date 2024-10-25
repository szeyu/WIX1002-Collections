package WIX1002_1_2017;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial tuition fee (i.e year 1):" );
        double initialTuitionFee = input.nextDouble();

        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double yearlyRateIncrement = input.nextDouble();

        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = input.nextInt();

        double computeFee = computeFee(initialTuitionFee, yearlyRateIncrement, year);
        System.out.printf("%nComputed tuition fee for year %d is: %.2f%n",year,computeFee);
    }

    public static double computeFee(double initialTuitionFee, double yearlyRateIncrement, int year){
        return initialTuitionFee * Math.pow(1+yearlyRateIncrement/100,year-1);
    }
}
