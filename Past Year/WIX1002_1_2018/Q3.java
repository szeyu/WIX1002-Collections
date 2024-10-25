package WIX1002_1_2018;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter font size: ");
        int fontSize = input.nextInt();

        System.out.print("Enter font type: ");
        String fontType = input.next();

        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = input.nextInt();

        if (format == 1)    vertical(fontSize, fontType);
        else                horizontal(fontSize, fontType);
    }

    public static void vertical(int fontSize, String fontType){
        StringBuilder output = new StringBuilder();

        // first line
        output.append(fontType);
        for (int i = 0; i < fontSize; i++) {
            output.append(fontType);
        }
        output.append(fontType);

        output.append('\n');

        // hole
        for (int j = 0; j < fontSize; j++) {
            output.append(fontType);
            for (int i = 0; i < fontSize; i++) {
                output.append(" ");
            }
            output.append(fontType);
            output.append('\n');
        }

        // middle line
        output.append(fontType);
        for (int i = 0; i < fontSize; i++) {
            output.append(fontType);
        }
        output.append(fontType);
        output.append('\n');

        // hole
        for (int j = 0; j < fontSize; j++) {
            output.append(fontType);
            for (int i = 0; i < fontSize; i++) {
                output.append(" ");
            }
            output.append(fontType);
            output.append('\n');
        }

        // last line
        output.append(fontType);
        for (int i = 0; i < fontSize; i++) {
            output.append(fontType);
        }
        output.append(fontType);
        output.append('\n');

        System.out.println(output.toString());
    }

    public static void horizontal(int fontSize, String fontType){
        StringBuilder output = new StringBuilder();

        // first line
        output.append(fontType);
        output.append(fontType);
        output.append(fontType);
        for (int i = 0; i < fontSize*2; i++) {
            output.append(fontType);
        }

        output.append('\n');

        // hole
        for (int j = 0; j < fontSize; j++) {
            output.append(fontType);
            for (int i = 0; i < fontSize; i++) {
                output.append(" ");
            }
            output.append(fontType);
            for (int i = 0; i < fontSize; i++) {
                output.append(" ");
            }
            output.append(fontType);
            output.append('\n');
        }

        // last line
        output.append(fontType);
        output.append(fontType);
        output.append(fontType);
        for (int i = 0; i < fontSize*2; i++) {
            output.append(fontType);
        }
        output.append('\n');

        System.out.println(output.toString());
    }
}
