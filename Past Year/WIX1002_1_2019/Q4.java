package WIX1002_1_2019;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        int[] charCount = new int[26];
        int noSentence = 0;
        int noWord = 1;
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/WIX1002_1_2019/myAmbition.txt"));
            in.readLine();
            String context = in.readLine();
            context = context.toUpperCase();
            for (int i = 0; i < context.length(); i++) {
                char ch = context.charAt(i);
                if(ch == '.'){
                    noSentence++;
                }
                if(ch == ' '){
                    noWord++;
                }
                int chPosition = ch - 'A';
                if(chPosition >= 0 && chPosition <= 25){
                    charCount[chPosition]++;
                }
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }

        System.out.println("Number of sentences : " + noSentence);
        System.out.println("Number of words : " + noWord);
        for (int i = 0; i < 26; i++) {
            System.out.print((char)('A'+i) + " : " + charCount[i] + " ");
        }
    }
}
