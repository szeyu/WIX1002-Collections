class BankAccount{
    private String name;
    private String IC;
    private String passportNumber;
    private double depositAmount;
    
    public BankAccount(){
        this.name = null;
        this.IC = null;
        this.passportNumber = null;
        this.depositAmount = 0;
    }
    
    public BankAccount(String name, String IC, String passportNumber, double depositAmount){
        this.name = name;
        this.IC = IC;
        this.passportNumber = passportNumber;
        this.depositAmount = depositAmount;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getIC(){
        return this.IC;
    }
    
    public void setIC(String IC){
        this.IC = IC;
    }
    
    public String getPassportNumber(){
        return this.passportNumber;
    }
    
    public void setPassportNumber(String passportNumber){
        this.passportNumber = passportNumber;
    }
    
    public void setDepositAmount(double depositAmount){
        this.depositAmount = depositAmount;
    }
    
    public String toString(){
        return "Name : " + this.name
                + "\n" + "IC : " + this.IC
                + "\n" + "Passport Number : " + this.passportNumber
                + "\n" + "Current Balance : " + String.format("RM %.2f",this.depositAmount);
    }
    
    public double getCurrentBalance(){
        return this.depositAmount;
    }
    
    public void withdrawMoney(double withdrawAmount){
        if (withdrawAmount > this.depositAmount){
            System.out.println("Sorry you are out of balance.");
        } else{
            this.depositAmount -= withdrawAmount;
            System.out.println("RM " + String.format("%.2f",withdrawAmount) + " deducted from your account.");
        }
    }
}

public class L08Q02 {
    public static void main(String[] args) {
        BankAccount customerA = new BankAccount();
        customerA.setName("Sim");
        customerA.setIC("0417");
        customerA.setPassportNumber("23005023");
        customerA.setDepositAmount(200);
        
        System.out.println(customerA.toString());
        
        System.out.println("Withdraw " + 300);
        customerA.withdrawMoney(300);
        System.out.println("Withdraw " + 10);
        customerA.withdrawMoney(10);
        System.out.println("Curent Balance : RM " + String.format("%.2f",customerA.getCurrentBalance()));
    }
}
