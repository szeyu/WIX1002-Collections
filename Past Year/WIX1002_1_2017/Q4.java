package WIX1002_1_2017;

import java.util.Scanner;

class Complex{
    private double real;
    private double imaginary;

    public Complex() {
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex addComplexNum(Complex complex){
        return new Complex(this.real + complex.real, this.imaginary + complex.imaginary);
    }

    public Complex subtractComplexNum(Complex complex){
        return new Complex(this.real - complex.real, this.imaginary - complex.imaginary);
    }

    @Override
    public String toString(){
        return "(" + real + " + " + imaginary + "i)";
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("First complex number. Enter a number for the real part: ");
        int real1 = input.nextInt();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        int imaginary1 = input.nextInt();
        Complex complex1 = new Complex(real1, imaginary1);

        System.out.print("Second complex number. Enter a number for the real part: ");
        int real2 = input.nextInt();
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        int imaginary2 = input.nextInt();
        Complex complex2 = new Complex(real2, imaginary2);

        System.out.println();
        System.out.printf("First complex number: %s%n",complex1.toString());
        System.out.printf("Second complex number: %s%n",complex2.toString());

        Complex ans1 = complex1.addComplexNum(complex2);
        System.out.printf("Addition of the complex numbers: %s%n",ans1.toString());

        Complex ans2 = complex1.subtractComplexNum(complex2);
        System.out.printf("Subtraction of the complex numbers: %s%n",ans2.toString());

    }
}
