package WIX1002_1_2017;

import java.util.Scanner;

class GradedActivity{
    private int score;

    public GradedActivity() {
    }

    public GradedActivity(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getGrade(){
        if(score >= 90)
            return "A";
        else if(score >= 80)
            return "B";
        else if(score >= 70)
            return "C";
        else if(score >= 60)
            return "D";
        else
            return "F";
    }

    @Override
    public String toString(){
        return "Total score: " + score + '\n' +
                "Essay grade: " + getGrade();
    }
}

class Essay extends GradedActivity{
    private int grammar;
    private int spelling;
    private int length;
    private int content;

    public Essay(int grammar, int spelling, int length, int content) {
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        setScore(grammar + spelling + length + content);
    }

    @Override
    public String toString(){
        return "Grammar: " + grammar + "\n" +
                "Spelling: " + spelling + "\n" +
                "Length: " + length + "\n" +
                "Content: " + content + "\n\n" +
                super.toString();
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = s.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = s.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = s.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = s.nextInt();

        Essay a = new Essay(grammar, spelling, length, content);
        System.out.println("\nEssay score:");
        System.out.println(a.toString());
    }
}
