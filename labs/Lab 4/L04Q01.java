import java.util.Scanner;
public class L04Q01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int integer = input.nextInt();
        
        System.out.print("The factors are: ");
        
        for(int i = 1; i <= (integer/2); i++){
            if (integer % i == 0){
                System.out.print(i + ", ");
            }
        }
        
        System.out.println(integer);
        input.close();
    }
}
