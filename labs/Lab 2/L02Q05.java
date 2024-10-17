import java.util.Random;
public class L02Q05 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomVal = random.nextInt(10001);
        System.out.println("Random No Generated: " + randomVal);
        
        int sum = 0;
        for (int i = 10; i < 10001; i = i * 10) {
            int temp = randomVal % i;
//            System.out.println(temp);
            sum += temp / (i/10);
            randomVal -= temp;
        }
        
        System.out.println("Sum of the digits : " + sum);      
        
    }
}
