public class L06Q01 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            System.out.print(triangularNum(i) + " ");
        }
        System.out.println();
    }
    
    public static int triangularNum(int number){
        int total = 0;
        for (int ct = 1; ct <= number; ct++){
            total += ct;
        }
        return total;
    }
}
