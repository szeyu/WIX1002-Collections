import java.util.*;
public class L04Q02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input integer n : ");
        int n = input.nextInt();
        int total = 0;
        int temp = 0;
        for(int i = 1; i <= n; i++){
            temp += i;
            total += temp;
        }
        
        System.out.println("Total : " + total);

        input.close();
    }
}
