package WIX1002_1_2021;

import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            boolean flag = false;
            System.out.print("Enter 3 numbers [1-9] : ");
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            if(a+b+c == 18){
                System.out.println(a + " + " + b + " + " + c + " = 18");
                flag = true;
            }
            if(a+b-c == 18){
                System.out.println(a + " + " + b + " - " + c + " = 18");
                flag = true;
            }
            if(a-b+c == 18){
                System.out.println(a + " - " + b + " + " + c + " = 18");
                flag = true;
            }
            if(a-b-c == 18){
                System.out.println(a + " - " + b + " - " + c + " = 18");
                flag = true;
            }
            if(a+b*c == 18){
                System.out.println(a + " + " + b + " * " + c + " = 18");
                flag = true;
            }
            if((a+b)*c == 18){
                System.out.println("(" + a + " + " + b + ") * " + c + " = 18");
                flag = true;
            }
            if(a-b*c == 18){
                System.out.println(a + " - " + b + " * " + c + " = 18");
                flag = true;
            }
            if((a-b)*c == 18){
                System.out.println("(" + a + " - " + b + ") * " + c + " = 18");
                flag = true;
            }
            if(a*b+c == 18){
                System.out.println(a + " * " + b + " + " + c + " = 18");
                flag = true;
            }
            if(a*(b+c) == 18){
                System.out.println(a + " * (" + b + " + " + c + ") = 18");
                flag = true;
            }
            if(a*b-c == 18){
                System.out.println(a + " * " + b + " - " + c + " = 18");
                flag = true;
            }
            if(a*(b-c) == 18){
                System.out.println(a + " * (" + b + " - " + c + ") = 18");
                flag = true;
            }
            if(a+b/c == 18){
                System.out.println(a + " + " + b + " / " + c + " = 18");
                flag = true;
            }
            if((a+b)/c == 18){
                System.out.println("(" + a + " + " + b + ") / " + c + " = 18");
                flag = true;
            }
            if(a-b/c == 18){
                System.out.println(a + " - " + b + " / " + c + " = 18");
                flag = true;
            }
            if((a-b)/c == 18){
                System.out.println("(" + a + " - " + b + ") / " + c + " = 18");
                flag = true;
            }
            if(a/b+c == 18){
                System.out.println(a + " / " + b + " + " + c + " = 18");
                flag = true;
            }
            if(a/(b+c) == 18){
                System.out.println(a + " / (" + b + " + " + c + ") = 18");
                flag = true;
            }
            if(a/b-c == 18){
                System.out.println(a + " / " + b + " - " + c + " = 18");
                flag = true;
            }
            if(a/(b-c) == 18){
                System.out.println(a + " / (" + b + " - " + c + ") = 18");
                flag = true;
            }
            if(a*b*c == 18){
                System.out.println(a + " * " + b + " * " + c + " = 18");
                flag = true;
            }
            if(a*b/c == 18){
                System.out.println(a + " * " + b + " / " + c + " = 18");
                flag = true;
            }
            if(a/b*c == 18){
                System.out.println(a + " / " + b + " * " + c + " = 18");
                flag = true;
            }
            if(a/b/c == 18){
                System.out.println(a + " / " + b + " / " + c + " = 18");
                flag = true;
            }

            if(!flag)
                System.out.println("No Solution");
        }
    }
}
