package WIX1002_2_2017;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int noTeam = input.nextInt();

        String[] teamNames = new String[noTeam];
        int[] teamScores = new int[noTeam];

        for (int i = 0; i < noTeam; i++) {
            // consume next line
            input.nextLine();

            System.out.print("Enter team " + (i+1) + " name: ");
            teamNames[i] = input.nextLine();

            System.out.print("Enter team " + (i+1) + " score: ");
            teamScores[i] = input.nextInt();

        }

        bubbleSort(teamNames, teamScores);
        System.out.println("List of team with the highest team score first");
        for (int i = 0; i < noTeam; i++) {
            System.out.print(teamNames[i] + " (" + teamScores[i] + ") | ");
        }
        System.out.println();
    }

    public static void bubbleSort(String[] teamNames, int[] teamScores){
        for (int i = 0; i < teamScores.length; i++) {
            for (int j = 0; j < teamScores.length - i - 1; j++) {
                if(teamScores[j] < teamScores[j+1]){
                    int tempScore = teamScores[j];
                    String tempName = teamNames[j];

                    teamScores[j] = teamScores[j+1];
                    teamNames[j] = teamNames[j+1];

                    teamScores[j+1] = tempScore;
                    teamNames[j+1] = tempName;
                }
            }
        }
    }
}
