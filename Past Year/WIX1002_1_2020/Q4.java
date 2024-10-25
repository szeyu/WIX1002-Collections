package WIX1002_1_2020;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        try {
            int noOfRecord = 0;

            BufferedReader input = new BufferedReader(new FileReader("src/WIX1002_1_2020/sampleLog.txt"));
            String line;
            while ((line = input.readLine()) != null ){
                noOfRecord++;
            }

            System.out.println("Reading from log file...");
            input = new BufferedReader(new FileReader("src/WIX1002_1_2020/sampleLog.txt"));
            String[][] records = new String[noOfRecord][22];
            for (int i = 0; i < noOfRecord; i++) {
                line = input.readLine();
                //System.out.println(line);
                String[] attributes = line.split(" ");
                //System.out.println(attributes[0]);
                for (int j = 0; j < attributes.length; j++) {
                    records[i][j] = attributes[j];
                }
            }

            System.out.println("**************************************");
            System.out.println("Records read from log file");
            System.out.println();

            for (int i = 0; i < records.length; i++) {
                System.out.println("Record " + (i+1) + ":");
                if(records[i][1].charAt(9) == 'Q'){
                    for (int j = 0; j < 2; j++) {
                        System.out.println("    " + records[i][j]);
                    }
                }
                else if(records[i][1].charAt(9) == 'S'){
                    for (int j = 0; j < 15; j++) {
                        System.out.println("    " + records[i][j]);
                    }
                }
                else if(records[i][1].charAt(9) == 'E'){
                    for (int j = 0; j < 22; j++) {
                        System.out.println("    " + records[i][j]);
                    }
                }
                System.out.println();
            }

            System.out.println("total records read: " + noOfRecord);
            System.out.println();


            System.out.println("**************************************");
            String[] users = new String[noOfRecord];
            int[] usersJobSubmitted = new int[noOfRecord];
            int noOfUser = 0;
            for (int i = 0; i < records.length; i++) {
                if(records[i][1].charAt(9) == 'S'){

                    String user = records[i][1].substring(records[i][1].indexOf("user=")+5);
                    int userIndex = findUser(users, user, noOfUser);
                    if(userIndex == -1){
                        users[noOfUser] = user;
                        usersJobSubmitted[noOfUser]++;
                        noOfUser++;
                    } else{
                        usersJobSubmitted[userIndex]++;
                    }
                }
            }

            System.out.println("Print user submission stat");
            System.out.println();
            System.out.printf("%-20s%s\n","User","Jobs Submitted");
            System.out.printf("%-20s%s\n","----","--------------");
            for (int i = 0; i < noOfUser; i++) {
                System.out.printf("%-20s%s\n",users[i],usersJobSubmitted[i]);
            }
            System.out.println();

            System.out.println("**************************************");
            System.out.println("Print jobs status");
            System.out.println();

            System.out.printf("%-15s%-25s%-30s%s\n","Job ID","Submitted (queue)","Started (start time)","Exited (end time/error)");
            System.out.printf("%-15s%-25s%-30s%s\n","------","-----------------","--------------------","-----------------------");

            for (int i = 0; i < records.length; i++) {
                if(records[i][1].charAt(9) == 'S'){
                    String jobID = records[i][1].substring(11,16);
                    String queue = records[i][4].substring(6);
                    String startTime = records[i][8].substring(6);
                    String exited = getString(records, i, jobID);

                    System.out.printf("%-15s%-25s%-30s%s\n",jobID,"Y (" + queue + ")","Y (" + startTime + ")",exited);
                }
            }

            System.out.println();
            System.out.println("**************************************");

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }

    private static String getString(String[][] records, int i, String jobID) {
        String exited = "null";
        for (int j = 0; j < records.length; j++) {
            //System.out.println(records[j][1].charAt(9) + " " + records[j][1].substring(11,16));
            if(records[j][1].charAt(9) == 'E' && records[j][1].substring(11,16).equals(jobID)){
                //System.out.println(Arrays.toString(records[j]));
                if(Arrays.toString(records[j]).contains("Exit_status")){
                    exited = "Error: Exit Status " + records[j][17].substring(12);
                } else{
                    exited = records[j][16].substring(4);
                }
            }
        }
        return exited;
    }

    public static int findUser(String[] users, String user, int noOfUser){
        for (int i = 0; i < noOfUser; i++) {
            if(users[i].equals(user)){
                return i; //return the position of user in the array
            }
        }
        return -1; //user not yet exist
    }
}
