import java.util.Scanner;
public class L05Q06 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int numberOfRow = input.nextInt();
        int[][] pascalMatrix = new int[numberOfRow][numberOfRow];
        
        // initialise base
        pascalMatrix[0][0] = 1;
        
        for(int i = 1; i < numberOfRow; i++){
            pascalMatrix[i][0] = 1;
            for(int j = 1; j < i+1; j++){
                pascalMatrix[i][j] = pascalMatrix[i-1][j-1] + pascalMatrix[i-1][j];
            }
        }
        
        System.out.println("The Pascal Triangle with " + numberOfRow + " row(s)");
        for(int row = 0; row < numberOfRow; row++){
            for(int column = 0; column < numberOfRow; column++){
                System.out.print(pascalMatrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
