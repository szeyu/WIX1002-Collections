package WIX1002_1_2018;

import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num, sum = 0;
        do{
            System.out.print("Enter an integer number, -1 to quit:");
            num = a.nextInt();
            if(num == -1)
                continue;

            if(num % 2 == 0)
                System.out.println("The number is an even number");
            else
                System.out.println("The number is an odd number");
            sum += num;
        } while (num != -1);
        System.out.printf("The sum of all integer number(s) is : %5d\n",sum);
    }
}
