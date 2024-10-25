package WIX1002_1_2021;

import java.io.*;

abstract class Eleven{
    private int[] array;
    private String fileName;

    public int[] getArray() {
        return array;
    }

    public Eleven(String fileName){
        this.fileName = fileName;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            int totalInt = 0;
            while (true){
                try{
                    in.readInt();
                    totalInt++;
                } catch(EOFException e) {
                    break;
                }
            }

            in = new ObjectInputStream(new FileInputStream(fileName));
            array = new int[totalInt];
            for (int i = 0; i < totalInt; i++) {
                array[i] = in.readInt();
            }

        } catch (IOException e) {
            System.out.print("Error with file input");
        }
    }

    abstract public String divide();
}

class DivideF1 extends Eleven{
    public DivideF1(String fileName) {
        super(fileName);
    }

    public String divide() {
        int[] array = super.getArray();
        StringBuilder output = new StringBuilder();
        output.append("Divisibility Rule (Formula 1)\n");
        for (int integer = 0; integer < array.length; integer++) {
            StringBuilder oddDigits = new StringBuilder();
            StringBuilder evenDigits = new StringBuilder();

            int oddSum = 0;
            int evenSum = 0;

            int tempInteger = array[integer];
            while (tempInteger != 0){
                int oddDigit = tempInteger % 10;
                oddSum += oddDigit;
                oddDigits.append(oddDigit).append(" + ");
                tempInteger /= 10;
                int evenDigit = tempInteger % 10;
                evenSum += evenDigit;
                evenDigits.append(evenDigit).append(" + ");
                tempInteger /= 10;
            }
            oddDigits.reverse();
            oddDigits.delete(0,3);
            evenDigits.reverse();
            evenDigits.delete(0,3);

            int x = oddSum - evenSum;
            output.append(array[integer]).append(" : |x| = | (").append(oddDigits).append(") - (").append(evenDigits).append(") | = ").append(x);
            output.append("\n");
            output.append(x).append(" modulus 11 ");
            if(x % 11 == 0){
                output.append("= 0, ").append(array[integer]).append(" is divisible by 11");
            } else{
                output.append("not equal to 0, ").append(array[integer]).append(" is not divisible by 11");
            }

            output.append("\n");
            output.append("\n");
        }

        return output.toString();
    }
}

class DivideF2 extends Eleven{
    public DivideF2(String fileName) {
        super(fileName);
    }

    public String divide() {
        int[] array = super.getArray();
        StringBuilder output = new StringBuilder();
        output.append("Divisibility Rule (Formula 2)\n");
        for (int integer = 0; integer < array.length; integer++) {
            output.append(array[integer]).append(" : ");

            int tempInteger = array[integer];
            while (tempInteger >= 100){
                int firstDigit = tempInteger % 10;
                int outputTempInteger = tempInteger/10;
                int newTempInteger = outputTempInteger - firstDigit;
                output.append(tempInteger).append(" - ").append(firstDigit).append(" * 1 = ").append(newTempInteger).append(", ");
                tempInteger = newTempInteger;

            }
            int x = tempInteger;
            output.append("x = ").append(x);
            output.append("\n");
            output.append(x).append(" modulus 11 ");
            if(x % 11 == 0){
                output.append("= 0, ").append(array[integer]).append(" is divisible by 11");
            } else{
                output.append("not equal to 0, ").append(array[integer]).append(" is not divisible by 11");
            }

            output.append("\n");
            output.append("\n");
        }

        return output.toString();
    }
}


public class Q4 {
    public static void main(String[] args) {
        writeFile();
        DivideF1 a = new DivideF1("src/WIX1002_1_2021/data.dat");
        DivideF2 b = new DivideF2("src/WIX1002_1_2021/data.dat");
        display(a);
        display(b);
    }

    public static void display(Eleven el){
        System.out.println(el.divide());
    }

    public static void writeFile(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/WIX1002_1_2021/data.dat"));
            out.writeInt(53434);
            out.writeInt(1033);
            out.writeInt(1353);
            out.writeInt(190817);
            out.close();

        } catch (IOException e) {
            System.out.print("Error with file output");
        }
    }
}
