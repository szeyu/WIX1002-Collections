class BurgerStall{
    private String name;
    private String ID;
    private int numberOfBurger;
    
    public BurgerStall(){
        this.name = null;
        this.ID = null;
        this.numberOfBurger = 0;        
    }
    
    public BurgerStall(String name, String ID, int numberOfBurger){
        this.name = name;
        this.ID = ID;
        this.numberOfBurger = numberOfBurger;        
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getID(){
        return this.ID;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public int getNumberOfBurger(){
        return this.numberOfBurger;
    }
    
    public void setNumberOfBurger(int numberOfBurger){
        this.numberOfBurger = numberOfBurger;
    }
    
    public void increaseBurgerSales(int noSales){
        this.numberOfBurger += noSales;
    }
    
    public String toString(){
        return "Name : " + this.name
                + "\n" + "ID : " + this.ID
                + "\n" + "Number of burger sold : " + this.numberOfBurger;
    }
    
}

public class L08Q06 {
    public static void main(String[] args) {
        BurgerStall stall1 = new BurgerStall("Al-Ehsan", "01", 2);
        BurgerStall stall2 = new BurgerStall("Al-Safuan", "02", 4);
        
        stall1.increaseBurgerSales(10);
        stall2.increaseBurgerSales(5);
        
        System.out.println(stall1.toString());
        System.out.println();
        System.out.println(stall2.toString());
        
        System.out.println("Total number of burgers sold in all stalls : " 
                + (stall1.getNumberOfBurger() + stall2.getNumberOfBurger())); 
        
    }
}
