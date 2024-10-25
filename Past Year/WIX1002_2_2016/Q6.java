package WIX1002_2_2016;

class FinancialRecord{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public FinancialRecord(){

    }

    public FinancialRecord(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            System.out.printf("Previous balance: RM%.2f%n",balance);
            balance -= amount;
            System.out.printf("Current balance after withdrawal of RM%.2f is: RM%.2f%n",amount,balance);

        } else{
            System.out.println("Not enough of balance.");
        }
    }

    public void deposit(double amount){
        System.out.printf("Previous balance: RM%.2f%n",balance);
        balance += amount;
        System.out.printf("Current balance after deposit of RM%.2f is: RM%.2f%n",amount,balance);
    }

    public void displayRecordInfo(){
        System.out.println("Financial record id is: RM" + id);
        System.out.printf("Financial record balance is: %.2f%n", balance);
        System.out.printf("Annual interest rate is: %.2f%n", annualInterestRate);
    }
}

public class Q6 {
    public static void main(String[] args) {
        FinancialRecord record = new FinancialRecord(1001, 20000);
        record.setAnnualInterestRate(8.0);

        record.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + record.getMonthlyInterestRate());

        record.deposit(1500);
        record.withdraw(500);

    }
}
