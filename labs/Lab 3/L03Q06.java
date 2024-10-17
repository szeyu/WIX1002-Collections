import java.util.Scanner;
import java.lang.Math;
public class L03Q06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Radius : ");
        int radius = input.nextInt();
        
        System.out.print("x : ");
        int x = input.nextInt();
        System.out.print("y : ");
        int y = input.nextInt();
        
        double distance = Math.sqrt(x*x + y*y);
        
        System.out.printf("Distance : %.2f%n", distance);
        
        if (distance < (double)radius)
            System.out.println("Inside the circle");
        else if (distance > (double)radius)
            System.out.println("Outside the circle");
        else
            System.out.println("on the circle");
        
        input.close();
    }
}
