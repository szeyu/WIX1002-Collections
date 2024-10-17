import java.util.Scanner;
public class L03Q01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int int1, int2;
        int1 = input.nextInt();
        int2 = input.nextInt();

        System.out.print("Enter the operand: ");
        String operand = input.next();
        
        switch(operand){
            case "/":
                System.out.println(int1 + " " + operand + " " + int2 + " = " + ((double)int1 / (double)int2));
                break;
            case "*":
                System.out.println(int1 + " " + operand + " " + int2 + " = " + (int1 * int2));
                break;
            case "+":
                System.out.println(int1 + " " + operand + " " + int2 + " = " + (int1 + int2));
                break;
            case "-":
                System.out.println(int1 + " " + operand + " " + int2 + " = " + (int1 - int2));
                break;

            default:
                System.out.println("invalid operand");
        }
        input.close();
    }
}
