import java.util.*;
public class L04Q08 {
    public static void main(String[] args){
        int[] primeNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
        
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.print("First N prime number (N): ");
        int n = input.nextInt();
        
        for(int i = 0; i < n; i++){
            int randomPick = random.nextInt(primeNumber.length);
            System.out.println(primeNumber[randomPick]);
        }
        input.close();
    }
}
