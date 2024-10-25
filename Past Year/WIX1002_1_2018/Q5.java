package WIX1002_1_2018;

abstract class Fruit{
    private String name;
    protected String type;

    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract public double totalPrice();

    @Override
    public String toString() {
        return type + " " + name;
    }
}

class Apple extends Fruit{
    private int quantity;

    public Apple(String type, int quantity) {
        super("Apple", type);
        this.quantity = quantity;
    }

    public double totalPrice(){
        if(type.equalsIgnoreCase("red")){
            return quantity * 1.8;
        } else {
            return quantity * 1.2;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " - " + quantity + String.format(" = RM %.2f",totalPrice());
    }
}

class Watermelon extends Fruit{
    private double weight;

    public Watermelon(String type, double weight) {
        super("Watermelon", type);
        this.weight = weight;
    }

    public double totalPrice(){
        if(type.equalsIgnoreCase("local")){
            if(weight < 2)
                return weight * 2.25;
            if(weight <= 5)
                return weight * 1.95;
            else
                return weight * 1.65;
        } else {
            if(weight < 2)
                return weight * 3.75;
            if(weight <= 5)
                return weight * 3.45;
            else
                return weight * 3.15;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " - " + weight + String.format("kg = RM %.2f",totalPrice());
    }
}

public class Q5 {
    public static void main(String[] args) {
        Apple f1 = new Apple("Red", 8);
        Apple f2 = new Apple("Green", 11);
        Watermelon f3 = new Watermelon("Local", 7.6);
        Watermelon f4 = new Watermelon("Imported", 4.0);

        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());

        System.out.println("The cheapest item is");
        if (f1.totalPrice()<f2.totalPrice() && f1.totalPrice()<f2.totalPrice() &&
                f1.totalPrice()<f3.totalPrice() && f1.totalPrice()<f4.totalPrice())
            System.out.println(f1.toString());
        else if (f2.totalPrice()<f3.totalPrice() && f2.totalPrice()<f4.totalPrice())
            System.out.println(f2.toString());
        else if (f3.totalPrice()<f4.totalPrice())
            System.out.println(f3.toString());
        else
            System.out.println(f4.toString());
    }
}
