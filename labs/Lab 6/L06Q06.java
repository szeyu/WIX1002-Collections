public class L06Q06 {
    public static void main(String[] args) {
        display20palindromePrime();
        display20Emrip();
    }
 
    
    public static void display20palindromePrime(){
        int ct = 0;
        int num = 2;
        while(ct < 20){
            if(palindromePrimeDetector(num)){
                System.out.print(num + " ");
                ct++;
            }
            num++;
        }
        System.out.println();
    }
    
    public static void display20Emrip(){
        int ct = 0;
        int num = 2;
        while(ct < 20){
            if(emirpDetector(num)){
                System.out.print(num + " ");
                ct++;
            }
            num++;
        }
        System.out.println();
    }
       
    public static boolean palindromePrimeDetector(int num){
        if(palindromeDetector(num) && primeDetector(num)){
            return true;
        }
        return false;
    }
    
    public static boolean emirpDetector(int num) {
        return primeDetector(num) && primeDetector(reverseNumber(num)) && !palindromeDetector(num);
    }
    
    public static int reverseNumber(int num){
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    
    public static boolean palindromeDetector(int num){
        int reversed = reverseNumber(num);
        if (reversed == num){
            return true;
        }
        return false;
    }
    
    public static boolean primeDetector(int num){
        for(int i = 2;  i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    
    
}
