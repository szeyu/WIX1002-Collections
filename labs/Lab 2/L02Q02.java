import java.util.Scanner;
public class L02Q02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("The price of the car : RM");
        double P = input.nextDouble();

        System.out.print("Down payment : RM");
        double D = input.nextDouble();

        System.out.print("Interest rate in % :");
        double R = input.nextDouble();

        System.out.print("Loan duration in year : RM");
        double Y = input.nextDouble();
        System.out.println();
           
        double M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Month payment : RM%.2f%n", M);

        input.close();
    }
}
