import java.util.*;
public class L04Q03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int minimum;
        int maximum;
        int total = 0;
        int squaredTotal = 0;
        int ct = 0;
        
        // imitate do while behavior
        System.out.print("Enter a score [negative score to quit]:");
        int score = input.nextInt();
        if (score < 0)
            System.exit(0);

        maximum = score;
        minimum = score;

        total += score;
        squaredTotal += score * score;
        ct++;
        
        while(true){
            System.out.print("Enter a score [negative score to quit]:");
            score = input.nextInt();
            if (score < 0)
                break;
            
            if (score > maximum)    maximum = score;
            if (score < minimum)    minimum = score;
            
            total += score;
            squaredTotal += score * score;
            ct++;
        }
        
        double average = (double)total/ct;
        double standardDeviation = Math.sqrt( (squaredTotal - (total*total)/ct) / (ct-1) );
        
        //System.out.println(total);
        System.out.println("Minimum Score: " + minimum);
        System.out.println("Maximum Score: " + maximum);
        System.out.printf("Average Score: %.2f%n", average);
        System.out.printf("Standard Deviation: %.2f%n", standardDeviation);
        input.close();
    }
}
