import java.util.Scanner;
public class L02Q01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in degree Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        System.out.println();
        
        double celsius = (fahrenheit-32)/1.8;
        System.out.printf("Celsius = %.2f%n", celsius);
        input.close();
    }
}
