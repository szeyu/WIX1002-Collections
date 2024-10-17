import java.util.*;
public class L05Q02 {
    public static void main(String[] args){
        Random random = new Random();
        int[] historyNum = new int[10];
        
        int ct = 0;
        while (ct < 10){
            int randomNum = random.nextInt(21);
            
            boolean duplicateFlag = false;
            for (int i = 0; i < ct; i++){
                if (historyNum[i] == randomNum){
                    duplicateFlag = true;
                    break;
                }
            }
            
            if (!duplicateFlag){
                historyNum[ct] = randomNum;
                ct++;
            }
                  
        }
        
        for(int num : historyNum){
            System.out.print(num + " ");
        }
        System.out.println("");
    }
}
