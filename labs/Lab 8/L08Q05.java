class Game{
    private String name;
    private int diceTotal = 0;
    Random random = new Random();
    
    public Game(){
        this.name = "";
    }
    
    public Game(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void moveDice(){
        int randomMove = random.nextInt(6)+1;
        System.out.println("Rolled a " + randomMove + "!");
        this.diceTotal += randomMove;
    }
    
    public int getDiceScore(){
        return this.diceTotal;
    }
    
    public boolean win(){
        if(this.diceTotal >= 100)
            return true;
        return false;
    }
}

public class L08Q05 {
    public static void main(String[] args) {
        Game player1 = new Game("Ali");
        Game player2 = new Game("Abu");
        
        while(true){
            System.out.println("Player 1 make a move.");
            player1.moveDice();
            System.out.println("Player 1 : " + player1.getDiceScore());
            if(player1.win()){
                System.out.println("Player 1 win");
                break;
            }
            
            System.out.println("Player 2 make a move.");
            player2.moveDice();
            System.out.println("Player 2 : " + player2.getDiceScore());
            if(player2.win()){
                System.out.println("Player 2 win");
                break;
            }
            
        }
    }
}
