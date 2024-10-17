abstract class Staff{
    abstract public double getSalary();
}

class PermanentEmployee extends Staff{
    private char category;
    
    public PermanentEmployee(char category){
        this.category = category;
    }
    
    public void setCategory(char category){
        this.category = category;
    }

    public double getSalary(){
        switch(category){
            case 'A':
                return 4000;
            case 'B':
                return 3000;
            case 'C':
                return 2000;
            default:
                return 0;
        }
    }
}

class contractStaff extends Staff{
    private final double salary = 500;
    private double totalSales;
    private double commission;
    
    public contractStaff(){
        this.totalSales = 0;
        commission = 0;
    }
    
    public contractStaff(double totalSales){
        this.totalSales = totalSales;
        computeCommission();
    }
    
    public void setTotalSales(double totalSales){
        this.totalSales = totalSales;
        computeCommission();
    }
    
    public void computeCommission(){
        commission = totalSales * 0.5;
    }
    
    public double getSalary(){
        computeCommission();
        return commission + salary;
    }
}

class TemporaryStaff extends Staff{
    private int hour;
    private final double salaryPerHour = 15;
    
    public TemporaryStaff(){
        this.hour = 0;
    }
    
    public TemporaryStaff(int hour){
        this.hour = hour;
    }
    
    public void setHour(int hour){
        this.hour = hour;
    }
    
    public double getSalary(){
        return hour * salaryPerHour;
    }
}

public class L10Q01 {
    public static void main(String[] args) {
        Staff employeeA = new PermanentEmployee('A');
        Staff employeeB = new PermanentEmployee('B');
        Staff employeeC = new PermanentEmployee('C');
        
        Staff employee1 = new contractStaff(100);
        Staff employee2 = new TemporaryStaff(10);
        
        System.out.printf("Salary of Employee Category A : RM %.2f%n", employeeA.getSalary());
        System.out.printf("Salary of Employee Category B : RM %.2f%n", employeeB.getSalary());
        System.out.printf("Salary of Employee Category C : RM %.2f%n", employeeC.getSalary());
        
        System.out.printf("Salary of Contract Staff : RM %.2f%n", employee1.getSalary());
        System.out.printf("Salary of Temporary Staff : RM %.2f%n", employee2.getSalary());
        
    }
}
