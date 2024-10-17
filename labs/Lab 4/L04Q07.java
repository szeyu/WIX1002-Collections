import java.util.*;
public class L04Q07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principalAmount = input.nextInt();
        
        System.out.print("Enter interest in %: ");
        int interest = input.nextInt();
        double monthlyInterest = (double)interest / 12 / 100;
        
        System.out.print("Enter total number of month(s): ");
        int numberOfMonth = input.nextInt();
        
        double monthlyPayment = ( (double)principalAmount * monthlyInterest) / 
                                ( 1 - Math.pow(1 + monthlyInterest, -1*numberOfMonth) );
        //System.out.println(monthlyPayment);
        
        
        System.out.printf("%-10s %-19s %-13s %-13s %-17s %-17s\n", "Month", "Monthly Payment", "Principal", "Interest","Unpaid Balance", "Total Interest");
        
        double cumulativeInterest = 0;
        for(int i = 1; i <= 12; i++){
                        
            double principalPortionDue = monthlyPayment * Math.pow(1 + monthlyInterest, -1 * (1 + numberOfMonth - i) );
            double interestDue = monthlyPayment - principalPortionDue;
            double remainingPrincipalBalanceDue = interestDue / monthlyInterest  - principalPortionDue;
            cumulativeInterest += interestDue;
            System.out.printf("%-10d %,15.2f %,13.2f %,12.2f %,19.2f %,17.2f\n", i, monthlyPayment, principalPortionDue, interestDue, remainingPrincipalBalanceDue, cumulativeInterest);
        }
        input.close();
    }
}