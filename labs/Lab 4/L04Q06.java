import java.util.*;

public class L04Q06 {
    public static void main(String[] args) {
        Random random = new Random();
        
        // Generate a non-negative random number (0 inclusive)
        int randomNo = random.nextInt(Integer.MAX_VALUE);
        System.out.println("Positive Random No: " + randomNo);

        // Handle the case where the random number is 0, which has 1 digit
        int i = (randomNo == 0) ? 1 : 0;

        // Count the number of digits
        while (randomNo > 0) {
            randomNo /= 10;
            i++;
        }

        System.out.println("Number of digits: " + i);
    }
}
