package WIX1002_2_2017;

import java.io.*;

class DayOfTheWeek{
    private int h;
    private int q;
    private int m;
    private int y;
    private int J;
    private int K;

    public DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;

        if(m == 1){
            this.m = 13;
            this.y--;
        } else if(m == 2){
            this.m = 14;
            this.y--;
        }
        System.out.println(this.q+"/"+ this.m +"/"+this.y);

        J = this.y / 100;
        K = this.y % 100;

        h = (int)(this.q + ((13 * (this.m + 1)) / 5) + K + (K / 4) + (J / 4) - (2 * J)) % 7;
    }

    public boolean validDayOfTheMonth(){
        switch (m){
            case 13:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(q > 31)
                    return false;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                if(q > 30)
                    return false;
                break;

            case 14:
                if(isLeapYear()){
                    if(q > 29)
                        return false;
                } else {
                    if(q > 28)
                        return false;
                }
                break;

        }
        return true;
    }

    public boolean isLeapYear(){
        return (((m >= 13 ? y+1:y) % 4 == 0) && ((m >= 13 ? y+1:y) % 100 != 0)) || (m >= 13 ? y+1:y) % 400 == 0;
    }

    public void displayDayOfTheWeek(){
        String day = switch (h){
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "invalid Input";
        };

        if(validDayOfTheMonth())
            System.out.println(q+"/"+ (m >= 13 ? m - 12:m) +"/"+ (m >= 13 ? y+1:y) + " is on " + day);
        else
            System.out.println(q+"/"+ (m >= 13 ? m - 12:m) +"/"+ (m >= 13 ? y+1:y) + " is invalid Input");
    }
}

public class Q4 {
    public static void main(String[] args) {
        generateFile();
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("src/WIX1002_2_2017/Q4.dat"));

            while (true) {
                try {
                    int q = input.readInt();
                    int m = input.readInt();
                    int y = input.readInt();
                    //System.out.println(q+"/"+ m +"/"+y);

                    DayOfTheWeek date = new DayOfTheWeek(q,m,y);
                    date.displayDayOfTheWeek();

                } catch(EOFException ignored){
                    break;
                }
            }

            input.close();
        } catch (IOException e){
            System.out.println("Error with file input");
        }

    }

    public static void generateFile() {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/WIX1002_2_2017/Q4.dat"));

            out.writeInt(25);
            out.writeInt(3);
            out.writeInt(2017);

            out.writeInt(29);
            out.writeInt(2);
            out.writeInt(2100);

            out.writeInt(19);
            out.writeInt(1);
            out.writeInt(2017);

            out.writeInt(31);
            out.writeInt(9);
            out.writeInt(2015);

            out.writeInt(31);
            out.writeInt(5);
            out.writeInt(2017);

            out.writeInt(29);
            out.writeInt(2);
            out.writeInt(2016);

            out.close();
        } catch (IOException e) {
            System.out.println("Error while generating file.");
        }
    }

}
