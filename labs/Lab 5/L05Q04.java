public class L05Q04 {
    public static void printMatrix(int[][] matrix){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int[][] matrix = {{1,5,7},
                          {3,6,9},
                          {5,3,8}};
        
        System.out.println("3 by 3 Matrix");
        printMatrix(matrix);
        
        // rotate 90 degree clockwise
        int[][] rotatedMatrix = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                rotatedMatrix[j][2-i] = matrix[i][j];
            }
        }
        
        System.out.println("After rotates 90 degree clockwise");
        printMatrix(rotatedMatrix);
    }
}
