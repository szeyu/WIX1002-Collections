import java.util.Random;
class Number {
    Random random = new Random();
    private int[] randomInteger;
    
    public Number(){
        this.randomInteger = new int[10];
        for(int i = 0; i < 10; i++){
            this.randomInteger[i] = random.nextInt(101);
        }
    }
    
    public Number(int length){
        this.randomInteger = new int[length];
        for(int i = 0; i < length; i++){
            this.randomInteger[i] = random.nextInt(101);
        }
    }
    
    public Number(int length, int range){
        this.randomInteger = new int[length];
        for(int i = 0; i < length; i++){
            this.randomInteger[i] = random.nextInt(range+1);
        }
    }
    
    public void getAll(){
        System.out.println("Full List:");
        for(int i = 0; i < this.randomInteger.length; i++){
            System.out.print(randomInteger[i] + " ");
        }
        System.out.println();
    }
    
    public void getEven(){
        System.out.println("Even:");
        for(int i = 0; i < this.randomInteger.length; i++){
            if(this.randomInteger[i] % 2 == 0)
                System.out.print(randomInteger[i] + " ");
        }
        System.out.println();
    }
    
    public boolean primeDetector(int number){
        for(int i  = 2; i*i < number; i++){
            if(number % i == 0)
                return false;
        }
        return true;
    }
    
    public void getPrime(){
        System.out.println("Prime:");
        for(int i = 0; i < this.randomInteger.length; i++){
            if(this.primeDetector(this.randomInteger[i]))
                System.out.print(this.randomInteger[i] + " ");
        }
        System.out.println();
    }
    
    public void getMax(){
        int max = this.randomInteger[0];
        for(int i = 1; i < this.randomInteger.length; i++){
            if(this.randomInteger[i] > max)
                max = this.randomInteger[i];
        }
        System.out.println("Max : " + max);
    }
    
    public void getMin(){
        int min = this.randomInteger[0];
        for(int i = 1; i < this.randomInteger.length; i++){
            if(this.randomInteger[i] < min)
                min = this.randomInteger[i];
        }
        System.out.println("Min : " + min);
    }
    
    public void getAverage(){
        double total = 0;
        for(int i = 1; i < this.randomInteger.length; i++){
            total += this.randomInteger[i];
        }
        double average = total / this.randomInteger.length;
        System.out.printf("Average : %.2f%n", average);
    }
    
    public void getSquare(){
        System.out.println("Squared List:");
        for(int i = 0; i < this.randomInteger.length; i++){
            System.out.print(randomInteger[i]*randomInteger[i] + " ");
        }
        System.out.println();
    }
}

public class L08Q01 {
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4,50);
        a.getAll();
        a.getEven();
        a.getPrime();
        a.getMax();
        a.getMin();
        a.getAverage();
        a.getSquare();
        
        System.out.println();
        
        b.getAll();
        b.getEven();
        b.getPrime();
        b.getMax();
        b.getMin();
        b.getAverage();
        b.getSquare();
        
        System.out.println();
        
        c.getAll();
        c.getEven();
        c.getPrime();
        c.getMax();
        c.getMin();
        c.getAverage();
        c.getSquare();
    }
}
