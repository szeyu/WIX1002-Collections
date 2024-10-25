package WIX1002_1_2016;

class CreditCard{
    private String cardHolderName;
    private String cardNum;
    private String type;
    private double totalCashReward = 0;

    public CreditCard(String cardHolderName, String cardNum, String type) {
        this.cardHolderName = cardHolderName;
        this.cardNum = cardNum;
        this.type = type;
    }

    public double getTotalCashReward() {
        return totalCashReward;
    }

    public void setTotalCashReward(double totalCashReward) {
        this.totalCashReward = totalCashReward;
    }

    @Override
    public String toString() {
        return "CreditCard : " + cardHolderName + " (" + cardNum + ")" + '\n' +
                "Card Type : " + type + '\n' +
                "Total Cash Reward : " + totalCashReward;
    }
}

class Rebate extends CreditCard{
    public Rebate(String cardHolderName, String cardNum) {
        super(cardHolderName, cardNum, "Cash Rebate");
    }

    public void getReward(String type, double price){
        if (type.equalsIgnoreCase("fuel")) {
            setTotalCashReward(getTotalCashReward() + price * 0.08);
            if (price >= 100)
                setTotalCashReward(getTotalCashReward() + 8);
        }
        else if (type.equalsIgnoreCase("utility"))
            setTotalCashReward(getTotalCashReward() + price*0.05);
        else if (type.equalsIgnoreCase("grocery"))
            setTotalCashReward(getTotalCashReward() + price*0.02);
        else
            setTotalCashReward(getTotalCashReward() + price*0.002);
    }
}
class Point extends CreditCard{
    public Point(String cardHolderName, String cardNum) {
        super(cardHolderName, cardNum, "Point Reward");
    }

    public void getReward(String day, double price){
        if (day.equalsIgnoreCase("friday"))
            setTotalCashReward(getTotalCashReward() + Math.floor(price)*2/100);
        else if (day.equalsIgnoreCase("saturday"))
            setTotalCashReward(getTotalCashReward() + Math.floor(price)*3/100);
        else if (day.equalsIgnoreCase("sunday"))
            setTotalCashReward(getTotalCashReward() + Math.floor(price)*4/100);
        else
            setTotalCashReward(getTotalCashReward() + Math.floor(price)/100);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim","1111222233334444");
        Point p = new Point("John Lim", "5555444433332222");
        //Reward
        r.getReward("grocery", 124.8);
        r.getReward("other", 64.60);
        r.getReward("fuel", 95.40);
        r.getReward("utility", 100);
        r.getReward("other", 220);
        System.out.print(r.toString());
        System.out.println();

        //Point
        p.getReward("saturday", 124.80);
        p.getReward("friday", 64.6);
        p.getReward("sunday", 95.4);
        p.getReward("friday", 100);
        p.getReward("tuesday", 220);
        System.out.println(p.toString());
        System.out.println();

        if (r.getTotalCashReward()>p.getTotalCashReward())
            System.out.println("The best card is Cash Rebate Card.");
        else
            System.out.println("The best card is Point Reward Card.");
    }
}
