package WIX1002_1_2019;

import java.util.Random;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N : ");

        int N = input.nextInt();
        int[][] matrixA = new int[N][N];
        int[][] matrixB = new int[N][N];
        int[][] matrixAns = new int[N][N];

        generateMatrix(matrixA, N);
        generateMatrix(matrixB, N);

        System.out.println("Matrix A");
        display(matrixA);
        System.out.println("Matrix B");
        display(matrixB);

        matrixAns = addMatrix(matrixA, matrixB);
        System.out.println("Matrix A + B");
        display(matrixAns);

        matrixAns = multiplyMatrix(matrixA, matrixB);
        System.out.println("Matrix A X B");
        display(matrixAns);

    }

    public static void generateMatrix(int[][] matrix, int N){
        Random random = new Random();
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N; column++) {
                matrix[row][column] = random.nextInt(10);
            }
        }
    }

    public static void display(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB){
        int N = matrixA.length;
        int[][] matrixAns = new int[N][N];
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N; column++) {
                matrixAns[row][column] = matrixA[row][column] + matrixB[row][column];
            }
        }
        return matrixAns;
    }

    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB){
        int N = matrixA.length;
        int[][] matrixAns = new int[N][N];
        for (int row = 0; row < N; row++) {
            for (int column = 0; column < N; column++) {
                for (int i = 0; i < N; i++) {
                    // System.out.print(matrixA[row][i] + " x " + matrixB[column][i] + " + ");
                    matrixAns[row][column] += matrixA[row][i] * matrixB[i][column];
                }
                // System.out.println();
            }
        }
        return matrixAns;
    }
}
