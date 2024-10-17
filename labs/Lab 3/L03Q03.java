import java.util.Scanner;
public class L03Q03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double commision;
        int salesVolume = input.nextInt();
        
        if (salesVolume <= 100)         commision = 0.05;
        else if (salesVolume <= 500)    commision = 0.075;
        else if (salesVolume <= 1000)   commision = 0.1;
        else                            commision = 0.125;
        
        double totalCommisionFee = salesVolume * commision;
        System.out.printf("Total commision received : %.2f%n", totalCommisionFee);
        input.close();
    }
}
