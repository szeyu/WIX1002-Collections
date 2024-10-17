import java.util.Scanner;
public class L03Q05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("a : ");
        int a = input.nextInt();
        System.out.print("b : ");
        int b = input.nextInt();
        System.out.print("c : ");
        int c = input.nextInt();
        System.out.print("d : ");
        int d = input.nextInt();
        System.out.print("e : ");
        int e = input.nextInt();
        System.out.print("f : ");
        int f = input.nextInt();
        
        int denominator = a*d - b*c;
        if (denominator == 0)
            System.out.println("The equation has no solution");
        else {
            int x = (e*d - b*f)/denominator;
            int y = (a*f - e*c)/denominator;
            
            if (x < (double)(e*d - b*f)/denominator) {
                if ((e*d - b*f) < 0 && denominator < 0)
                    System.out.println("x : " + -1*(e*d - b*f) + "/" + -1*denominator);
                else
                System.out.println("x : " + (e*d - b*f) + "/" + denominator);
            }
            else
                System.out.println("x : " + x);
            
            if (y < (double)(a*f - e*c)/denominator) {
                if ((a*f - e*c) < 0 && denominator < 0)
                    System.out.println("y : " + -1*(a*f - e*c) + "/" + -1*denominator);
                else
                System.out.println("y : " + (a*f - e*c) + "/" + denominator);
            }
            else
                System.out.println("y : " + y);
                                  
        }
        input.close();
    }
}
