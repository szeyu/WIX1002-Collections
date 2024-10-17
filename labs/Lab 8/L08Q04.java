class Fraction{
    private int numerator;
    private int denominator;
    
    public Fraction(){
        this.numerator = 0;
        this.denominator = 1;
    }
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    
    public int getNumerator(){
        return this.numerator;
    }
    
    public void setNumberator(int numerator){
        this.numerator = numerator;
    }
    
    public int getDenominator(){
        return this.denominator;
    }
    
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }
    
    // method to call determine the greater number first then recurive find GCD
    public int GCD(){
        if (this.numerator > this.denominator)
            return this.GCD(this.numerator, this.denominator);
        else
            return this.GCD(this.denominator, this.numerator);
    }
    
    private int GCD(int greaterTerm, int smallerTerm){
        if(greaterTerm % smallerTerm == 0)
            return smallerTerm;
        
        return GCD(smallerTerm, greaterTerm % smallerTerm);
        
    }
    
    public void simplifyLowestTerm(){
        int GCD = this.GCD();
        System.out.println("Simplified Lowest Term:");
        System.out.println(this.numerator/GCD + " / " + this.denominator/GCD);
    }
    
    public String toString(){
        return (this.numerator + " / " + this.denominator);
    }
    
}


public class L08Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numerator : ");
        int numberator = sc.nextInt();
        System.out.print("Denominator : ");
        int denominator = sc.nextInt();
        
        Fraction fraction = new Fraction(numberator, denominator);
        System.out.println(fraction.toString());
        
        fraction.simplifyLowestTerm();
        
    }
}
