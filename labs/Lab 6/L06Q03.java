import java.util.Scanner;
public class L06Q03 {
    public static void main(String[] args) {
        int[] arrayNum = new int[10];
        arrayInput(arrayNum);
        
        System.out.println("Initial Array: ");
        for(int each : arrayNum){
            System.out.print(each + " ");
        }
        System.out.println();
        
        reverseNumArray(arrayNum);
        
        System.out.println("Reversed Num In The Array: ");
        for(int each : arrayNum){
            System.out.print(each + " ");
        }
        System.out.println();
        
        
    }
    
    public static void arrayInput(int[] arrayNum){
        
        Scanner input = new Scanner(System.in);
        for(int ct = 0; ct < 10; ct++){
            arrayNum[ct] = input.nextInt();
        }
        input.close();
    }
    
    public static void reverseNumArray(int[] arrayNum){
        for(int i = 0; i < arrayNum.length; i++){
            // Convert the integer to a string
            String strNumber = Integer.toString(arrayNum[i]);

            // Use StringBuilder to reverse the string
            StringBuilder reversedStr = new StringBuilder(strNumber).reverse();

            // Convert the reversed string back to an integer
            int reversed = Integer.parseInt(reversedStr.toString());
            arrayNum[i] = reversed;
        }
        
    }
}
