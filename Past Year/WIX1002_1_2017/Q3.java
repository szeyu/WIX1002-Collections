package WIX1002_1_2017;

import java.util.Random;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

public class Q3 {
    public static void main(String[] args) {
        generateString();
        String originalString = readString();
        if(!originalString.equals("")){
            ascendingOrderString(originalString);
            descendingOrderString(originalString);
            System.out.println("Original string from file: " + originalString);
        }
    }

    public static void generateString(){
        Random random = new Random();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            string.append((char)(random.nextInt(26) + 65));
            string.append((char)(random.nextInt(26) + 97));
        }
        String generatedString = string.toString();
        System.out.println("The string generated is: " + generatedString);
        writeFile(generatedString);
    }

    public static void writeFile(String string){
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("src/WIX1002_1_2017/data.txt"));
            out.print(string);
            out.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }

    public static String readString(){
        String originalString = "";
        try {
            Scanner in = new Scanner(new FileInputStream("src/WIX1002_1_2017/data.txt"));
            originalString = in.nextLine();
            in.close();

        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
        return originalString;
    }

    public static void ascendingOrderString(String string){
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if(charArray[j] > charArray[j+1]){
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }
        String sortedString = new String(charArray);
        System.out.println("String sorted in ascending order: " + sortedString);
    }

    public static void descendingOrderString(String string){
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if(charArray[j] < charArray[j+1]){
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }
        String sortedString = new String(charArray);
        System.out.println("String sorted in descending order: " + sortedString);
    }
}
