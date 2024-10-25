package WIX1002_1_2020;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try {
            int[] frequency = new int[5];
            Scanner input = new Scanner(new FileInputStream("src/WIX1002_1_2020/raw.txt"));

            while (input.hasNextInt()){
                frequency[input.nextInt()/2 - 1]++;
            }

            int highest = frequency[0];
            int mode = 2;
            System.out.println("Frequency Distribution Table");
            for (int label = 1; label <= 5; label ++) {
                if(frequency[label-1] > highest){
                    highest = frequency[label-1];
                    mode = label*2;
                }
                System.out.println(label*2 + " : " + frequency[label-1]);
            }

            System.out.println("The mode of the dataset is : " + mode);

        } catch (IOException e){
            System.out.println("Error with file input");
        }



    }
}
