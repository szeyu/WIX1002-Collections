class Money {
    private double inputAmount;
    private double roundedMoney;
    private final double[] divisor = {100, 50, 10, 5, 1, 0.5, 0.2, 0.1, 0.05, 0.01};
    private int[] cashUsed = new int[10];

    public Money(double money) {
        this.inputAmount = money;
        round();
        numberOfNotesAndCents();
    }

    private void numberOfNotesAndCents() {
        double tempMoney = this.roundedMoney;
        for (int i = 0; i < 10; i++) {
            cashUsed[i] = (int) (tempMoney / divisor[i]);
            tempMoney = tempMoney % divisor[i];
        }
    }

    private void round() {
        int remainder = (int) (this.inputAmount*100) % 10;
        if(remainder <= 2){
            this.roundedMoney = this.inputAmount - (double)remainder/100;
        }else if(remainder > 2 && remainder <= 7){
            this.roundedMoney =  this.inputAmount - (double)remainder/100 + 0.05;
        }else{
            this.roundedMoney = this.inputAmount - (double)remainder/100 + 0.1;
        }
    }

    public void display() {
        System.out.printf("RM %.2f after Round Up RM %.2f%n",this.inputAmount, this.roundedMoney);
        for (int i = 0; i < 5; i++) {
            System.out.println(cashUsed[i] + " RM " + divisor[i]);
        }
        for (int i = 5; i < 9; i++) {
            System.out.println(cashUsed[i] + " " + (int)(divisor[i]*100) + " cents");
        }
    }

    public double addition(Money m) {
        double totalMoney = m.roundedMoney + this.roundedMoney;
        return totalMoney;
    }

    public double subtraction(Money m) {
        double totalMoney = this.roundedMoney - m.roundedMoney;
        return totalMoney;
    }

}

public class L08Q07 {
    public static void main(String[] args) {
        System.out.println("M1:");
        Money m1 = new Money(1587.32);
        m1.display();
        System.out.println();
        System.out.println("M2:");
        Money m2 = new Money(255.78);
        m2.display();
        double totaladd = m1.addition(m2);
        double totalsub = m2.subtraction(m1);
        System.out.printf("M1+M2: RM%.2f\n",totaladd);
        System.out.printf("M2-M1: RM%.2f\n",totalsub);
        
    }
}
