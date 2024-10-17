class Shape{
    private String name;
    private double perimeter;
    private double area;
    
    public Shape(){
        this.name = null;
        this.perimeter = 0;
        this.area = 0;
    }
    
    public Shape(String name){
        this.name = name;
        this.perimeter = 0;
        this.area = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" + "name=" + this.name + ", perimeter=" + String.format("%.2f",this.perimeter) + ", area=" + String.format("%.2f",this.area) + '}';
    }
}

class Rectangle extends Shape{
    
    private double width;
    private double length;

    public Rectangle(){
        super("Rectangle");
    }

    public Rectangle(double width, double length){
        super("Rectangle");
        this.width = width;
        this.length = length;
        super.setArea(width*length);
        super.setPerimeter(2*length + 2*width);
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        super.setArea(width*this.length);
        super.setPerimeter(2*this.length + 2*width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        super.setArea(this.width*length);
        super.setPerimeter(2*length + 2*this.width);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Rectangle{" + "width=" + this.width + ", length=" + this.length + '}';
    }
}

class Square extends Shape{
    
    private double side;

    public Square(){
        super("Square");
    }

    public Square(double side){
        super("Square");
        this.side = side;
        super.setArea(side*side);
        super.setPerimeter(side*4);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        super.setArea(side*side);
        super.setPerimeter(side*4);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Square{" + "side=" + this.side + '}';
    }
}

class Circle extends Shape{
    
    private double diameter;

    public Circle(){
        super("Circle");
    }

    public Circle(double diameter){
        super("Circle");
        this.diameter = diameter;
        super.setArea(Math.PI * (diameter/2) * (diameter/2));
        super.setPerimeter(Math.PI * diameter);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setRadius(double diameter) {
        this.diameter = diameter;
        super.setArea(Math.PI * (diameter/2) * (diameter/2));
        super.setPerimeter(Math.PI * diameter);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Circle{" + "diameter=" + this.diameter + '}';
    }
}



public class L09Q01 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(rectangle.toString());
        
        System.out.println();
        
        Square square = new Square(5);
        System.out.println(square.toString());
        
        System.out.println();
        
        Circle circle = new Circle(6);
        System.out.println(circle.toString());
    }
}
