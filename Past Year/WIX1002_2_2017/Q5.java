package WIX1002_2_2017;

class Staff{
    private String name;
    private String IC;

    public Staff(String name, String IC) {
        this.name = name;
        this.IC = IC;
    }

    @Override
    public String toString(){
        return "Full Name: " + name + "\n" +
                "IC: " + IC;
    }

}

class PermanentStaff extends Staff{
    private String grade;

    public PermanentStaff(String name, String IC, String grade) {
        super(name, IC);
        this.grade = grade;
    }

    public double getSalary() {
        return switch (grade) {
            case "EM01" -> 7000;
            case "EM02" -> 5000;
            case "EM03" -> 3000;
            case "EM04" -> 1000;
            default -> 0;
        };
    }

    @Override
    public String toString(){
        return super.toString() + '\n' +
                "Grade: " + grade + '\n' +
                "Salary: RM" + getSalary();
    }
}

class PartTimeStaff extends Staff{
    private int noWorkingHour;

    public PartTimeStaff(String name, String IC, int noWorkingHour) {
        super(name, IC);
        this.noWorkingHour = noWorkingHour;
    }

    public double getSalary() {
        return noWorkingHour * 40;
    }

    @Override
    public String toString(){
        return super.toString() + '\n' +
                "Number of working hours: " + noWorkingHour + '\n' +
                "Salary: RM" + getSalary();
    }
}

public class Q5 {
    public static void main(String[] args) {
        PermanentStaff p1 = new PermanentStaff("Abdul Razak", "871001-14-1765","EM02");
        PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "911223-08-3301",35);
        System.out.println(p1.toString());
        System.out.println();
        System.out.println(p2.toString());
    }
}
