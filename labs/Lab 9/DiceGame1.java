
import java.util.Random;

public class DiceGame1 {
    Random random = new Random();
    private String name;
    private int score;
    private int dice1;
    private int dice2;
    
    public DiceGame1(){
        this.score = 0;
        this.name = null;
    }
    
    public DiceGame1(String name){
        this.score = 0;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
          
    public int getScore(){
        return this.score;
    }
    
    public void checkSame(){
        if(this.dice1 == this.dice2){
            System.out.println(this.name + " can reroll");
            rollDice();
        }
    }
    
    public void rollDice(){
        this.dice1 = random.nextInt(6) + 1;
        this.dice2 = random.nextInt(6) + 1;
        this.score = this.score + this.dice1 + this.dice2;
        System.out.println(this.toString());
        if(!this.checkWin())
            this.checkSame();
    }
    
    public boolean checkWin(){
        if(this.score >= 100){
            return true;
        }
        return false; 
    }

    @Override
    public String toString() {
        return "DiceGame1{" + "\n"
                + "\t" + "name = " + name + "\n"
                + "\t" + "score = " + score + "\n"
                + "\t" +  "dice1 = " + dice1 + "\n" 
                + "\t" +  "dice2 = " + dice2 + "\n"
                + '}';
    }
}
