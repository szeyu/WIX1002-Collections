import java.util.*;
public class L04Q06 {
    public static void main(String[] args){
        Random random = new Random();
        int randomNo = Math.abs(random.nextInt()); //non negative random number
        long i = 10;
        int digitPlace = 1;
        while(true){
//            System.out.println(i);
//            System.out.println(digitPlace);
            if (randomNo / i == 0)
                break;
            
            i *= 10;
            digitPlace++;
        }
        
        System.out.println("Positive Random No : " + randomNo);
        System.out.println("Number of digit : " + digitPlace);
    }
}
