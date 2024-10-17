import java.util.Random;

public class DiceGame2 {
    Random random = new Random();
    private String name;
    private int score;
    private int dice;
    private int diceNextState;
    private boolean reroll;
    
    public DiceGame2(){
        this.score = 0;
        this.dice = 0;
        this.name = null;
        this.reroll = false;
    }
    
    public DiceGame2(String name){
        this.score = 0;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
          
    public int getScore(){
        return this.score;
    }
    
    public void gameLogic(){
        if(this.dice == 6){
            if(!this.reroll){
                this.reroll = true;
                this.score = this.score + this.dice;
                if(this.score > 100) {
                    System.out.println("Score exceed 100, score not counted");
                    this.score -= this.dice;
                }
                System.out.println(this.toString());
                if(!checkWin()){
                    System.out.println(this.name + " can reroll");
                    this.rollDice();
                }
            } else {
                System.out.println(this.toString());
                if(!checkWin()){
                    System.out.println("Reroll last time already. Thus no score this turn");
                }
            }
        } else {
            this.reroll = false;
            this.score = this.score + this.dice;
            if(this.score > 100) {
                    System.out.println("Score exceed 100, score not counted");
                    this.score -= this.dice;
                }
            System.out.println(this.toString());
        }
            
    }
    
    public void rollDice(){
        this.dice = random.nextInt(6) + 1;
        
        if(!this.checkWin())
            this.gameLogic();        
    }
    
    public boolean checkWin(){
        if(this.score == 100){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "DiceGame2{" + "\n"
                + "\t" + "name = " + name + "\n"
                + "\t" + "score = " + score + "\n"
                + "\t" +  "dice = " + dice + "\n" 
                + '}';
    }
}
