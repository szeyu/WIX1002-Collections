package WIX1002_1_2019;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String genome;

        while (true){
            System.out.print("Enter genome string [quit to stop] : ");
            genome = input.next();
            if(genome.equals("quit"))
                break;
            String[] genomeSplit = genome.split("ATG");
            //System.out.println(Arrays.toString(genomeSplit));

            String extractGenome = "";
            boolean genomeFlag = false;


            int split = 1;
            if(genome.startsWith("ATG"))
                split = 0;
            for (; split < genomeSplit.length; split++) {
                if(genomeSplit[split].contains("TAG")){
                    extractGenome = genomeSplit[split].substring(0,genomeSplit[split].indexOf("TAG"));

                    if(extractGenome.length() % 3 == 0 && !extractGenome.isEmpty()) {
                        if (!(extractGenome.contains("ATG") || extractGenome.contains("TAG") || extractGenome.contains("TAA") || extractGenome.contains("TGA"))) {
                            System.out.println(extractGenome);
                            genomeFlag = true;
                        }
                    }
                }
                if(genomeSplit[split].contains("TAA")){
                    extractGenome = genomeSplit[split].substring(0,genomeSplit[split].indexOf("TAA"));

                    if(extractGenome.length() % 3 == 0 && !extractGenome.isEmpty()){
                        if(!(extractGenome.contains("ATG") || extractGenome.contains("TAG") || extractGenome.contains("TAA") || extractGenome.contains("TGA"))) {
                            System.out.println(extractGenome);
                            genomeFlag = true;
                        }
                    }
                }
                if(genomeSplit[split].contains("TGA")){
                    extractGenome = genomeSplit[split].substring(0,genomeSplit[split].indexOf("TGA"));

                    if(extractGenome.length() % 3 == 0 && !extractGenome.isEmpty()){
                        if(!(extractGenome.contains("ATG") || extractGenome.contains("TAG") || extractGenome.contains("TAA") || extractGenome.contains("TGA"))) {
                            System.out.println(extractGenome);
                            genomeFlag = true;
                        }
                    }
                }
            }

            if(!genomeFlag){
                System.out.println("No gene is found");
            }
        }
    }
}
