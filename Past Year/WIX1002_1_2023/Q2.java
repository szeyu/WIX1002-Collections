package WIX1002_1_2023;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int noStudent = 0;
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter the number of students: ");
            noStudent = input.nextInt();

            if(noStudent >= 0 && noStudent <= 10){
                break;
            } else {
                System.out.print("Error !!! ");
            }
        }

        int[][] studentMarkforEachSubject = new int[noStudent][];

        for (int i = 0; i < noStudent; i++) {
            int noSubject = 0;
            while(true){
                System.out.print("Enter the number of subjects for student " + (i+1) + ": ");
                noSubject = input.nextInt();

                if(noSubject >= 0 && noSubject <= 10){
                    break;
                } else {
                    System.out.print("Error !!! ");
                }
            }
            studentMarkforEachSubject[i] = new int[noSubject];

            for (int j = 0; j < noSubject; j++) {
                int mark = 0;
                while(true){
                    System.out.print("Student ("+(i+1)+") Enter mark for Subject " + (j+1)+ ":");
                    mark = input.nextInt();

                    if(mark >= 0 && mark <= 100){
                        break;
                    } else {
                        System.out.print("Error !!! ");
                    }
                }

                studentMarkforEachSubject[i][j] = mark;
            }
        }

        int highestAverage = 0;
        int bestStudent = 0;
        System.out.println("List of Students ("+noStudent+" students)");
        for (int i = 0; i < noStudent; i++) {
            System.out.println("Student " + (i+1));
            int sum = 0;
            for (int j = 0; j < studentMarkforEachSubject[i].length; j++) {
                System.out.printf(" Subject %d:%d%n",i+1,studentMarkforEachSubject[i][j]);
                sum += studentMarkforEachSubject[i][j];
            }
            int average = sum/studentMarkforEachSubject[i].length;
            if(average > highestAverage){
                highestAverage = average;
                bestStudent = i+1;
            }
            System.out.println("Average Marks: " + average);
        }

        System.out.println("Student " + bestStudent + " has the highest average, with " + highestAverage + " marks");
    }
}
