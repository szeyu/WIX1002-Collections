public class L06Q02 {
    public static void main(String[] args) {
        multiPrint(4, 'c');
        
        System.out.println("Triangle");
        multiPrint(1,'c');
        multiPrint(2,'c');
        
        System.out.println("Diamond");
        System.out.print(" ");
        multiPrint(1,'c');
        multiPrint(3,'c');
        System.out.print(" ");
        multiPrint(1,'c');
    }
    
    public static void multiPrint(int n, char c){
        for(int ct = 0; ct < n; ct++){
            System.out.print(c);
        }
        System.out.println();
    }
}
