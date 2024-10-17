import java.util.*;
public class L05Q01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N students: ");
        int N = input.nextInt();
        
        int[] studentScoreList = new int[N];
        
        int highest = 0;
        int lowest = 100;
        double total = 0;
        
        for(int i = 0; i < N; i++){
            System.out.print("Score " + (i+1) + " : ");
            int score = input.nextInt();
            
            if(score > highest)
                highest = score;
            if(score < lowest)
                lowest = score;
            studentScoreList[i] = score;
            total += score;
        }
        
        double average = total / N;
        
        System.out.println("Student Score List :");
        for (int eachScore : studentScoreList){
            System.out.print(eachScore + " ");
        }
        System.out.println("");
        
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score : " + lowest);
        System.out.println("Average Score : " + average);

        input.close();
    }
      
}
