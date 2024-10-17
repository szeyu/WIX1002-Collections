import java.util.*;
public class L06Q05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int score = 0;
        
        while(true){
            System.out.println("Enter a negative number to quit.");
            int parameter1 = random.nextInt(12)+1;
            int parameter2 = random.nextInt(12)+1;
            System.out.print(parameter1 + " x " + parameter2 + " = ");
            int answer = input.nextInt();
            
            if(answer < 0){
                break;
            }
            
            if(checkAns(parameter1, parameter2, answer))
                score++;              
        }
        
        System.out.println("Your score is " + score);
        input.close();
    }
    
    public static boolean checkAns(int parameter1, int parameter2, int answer){
        if (answer == parameter1*parameter2)
            return true;
        return false;
    }
}
