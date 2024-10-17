class WeightCalculator{
    private int age;
    private double height;
    
    public WeightCalculator(){
        this.age = 0;
        this.height = 0;
    }
    
    public WeightCalculator(int age, double height){
        this.age = age;
        this.height = height;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public double getHeight(){
        return this.height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public String toString(){
        return "Age: " + this.age
                + "\n" + "Height : " + String.format("%.1f",this.height) + " cm";
    }
    
    public double recommendedWeight(){
        return (this.height - 100 + ((double)this.age)/10) * 0.9;
    }
}

public class L08Q03 {
    public static void main(String[] args) {
        WeightCalculator weight = new WeightCalculator();
        weight.setAge(19);
        weight.setHeight(171.0);
        
        System.out.println(weight.toString());
        
        System.out.printf("Recommended weight : %.2f kg%n", weight.recommendedWeight());
    }
}
