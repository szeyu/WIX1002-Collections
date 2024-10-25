package WIX1002_1_2016;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;

public class Q4 {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(new FileInputStream("src/WIX1002_1_2016/Q4.txt"));
            while (in.hasNextLine()){
                String password = in.nextLine();
                //System.out.println(password);
                if(strengthChecker(password))
                    System.out.println("Strong password.");
                else
                    System.out.println("Not a strong password.");
            }

        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }

    public static boolean strengthChecker(String password){
        boolean length = (password.length() >= 8);
        boolean upper = false, lower = false, digit = false, nonAplhaChar = false;

        for (int i = 0; i < password.length(); i++) {
            if((int) 'A' <= (int) password.charAt(i) && (int) password.charAt(i) <= (int) 'Z'){
                upper = true;
            }
            else if((int) 'a' <= (int) password.charAt(i) && (int) password.charAt(i) <= (int) 'z'){
                lower = true;
            }
            else if((int) '0' <= (int) password.charAt(i) && (int) password.charAt(i) <= (int) '9'){
                digit = true;
            }
            else if((int)password.charAt(i) != (int)' '){
                nonAplhaChar = true;
            }
        }

        return length && upper && lower && digit && nonAplhaChar;
    }
}
