import java.util.*;
public class L05Q03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Enter the number of employee : ");
        int numEmployee = input.nextInt();
        System.out.println();
        
        for (int employee = 1; employee <= numEmployee; employee++){
            System.out.println("Empliyee " + employee);
            int total = 0;
            for(int workDay = 0; workDay < 7; workDay++){
                int workHour = random.nextInt(7)+1;
                total += workHour;
                System.out.print(workHour + " ");
            }
            System.out.println();
            System.out.println("Total work hour : " + total);
            System.out.println();
        }
        input.close();
    }
}
