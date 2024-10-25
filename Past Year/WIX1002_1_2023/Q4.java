package WIX1002_1_2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class Node{
    protected String NodeName;
    protected int CPUTot;
    protected int CPUAlloc;
    protected int RealMemory;
    protected int AllocMem;
    protected String Partitions;

    public Node(String nodeName, int CPUTot, int CPUAlloc, int realMemory, int allocMem, String partitions) {
        NodeName = nodeName;
        this.CPUTot = CPUTot;
        this.CPUAlloc = CPUAlloc;
        RealMemory = realMemory/1000;
        AllocMem = allocMem/1000;
        Partitions = partitions;
    }

    public double efficiencyRatio(){
        return Math.abs( ((double)(CPUTot - CPUAlloc) / CPUTot) - ((double)(RealMemory - AllocMem) / RealMemory) );
    }

    @Override
    public String toString(){
        return String.format("| %-8s%-14s%2d / %2d   %3dG / %3dG  %.3f |",NodeName,Partitions,CPUAlloc,CPUTot,AllocMem,RealMemory,efficiencyRatio());
    }
}

public class Q4 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new FileInputStream("src/WIX1002_1_2022/nodelist.txt"));
            String line;
            String[] extract;
            int noNode = 0;
            while(input.hasNextLine()){
                line = input.nextLine();
                if(!line.startsWith("NodeName")){
                    continue;
                }
                noNode++;
            }

            Node[] nodes = new Node[noNode];

            input = new Scanner(new FileInputStream("src/WIX1002_1_2022/nodelist.txt"));
            for (int i = 0; i < noNode; i++) {
                line = input.nextLine();
                line = line.trim();
                extract = line.split("\\s+");
                String NodeName = extract[0].substring(extract[0].indexOf("=")+1);

                line = input.nextLine();
                extract = line.split("\\s+");
                int CPUAlloc = Integer.parseInt(extract[1].substring(extract[1].indexOf("=")+1));
                int CPUTot = Integer.parseInt(extract[2].substring(extract[2].indexOf("=")+1));

                input.nextLine();
                input.nextLine();
                input.nextLine();
                input.nextLine();
                input.nextLine();
                line = input.nextLine();
                line = line.trim();
                extract = line.split("\\s+");
                int RealMemory = Integer.parseInt(extract[0].substring(extract[0].indexOf("=")+1));
                int AllocMem = Integer.parseInt(extract[1].substring(extract[1].indexOf("=")+1));

                input.nextLine();
                line = input.nextLine();
                line = line.trim();
                extract = line.split("\\s+");
                String Partitions = extract[0].substring(extract[0].indexOf("=")+1);

                nodes[i] = new Node(NodeName,CPUTot,CPUAlloc,RealMemory,AllocMem,Partitions);

                input.nextLine();
                input.nextLine();
                input.nextLine();
                input.nextLine();
                input.nextLine();
                input.nextLine();
                input.nextLine();
                input.nextLine();

            }
            System.out.println("+----------------------------------------------------+");
            System.out.printf("| %-8s%-16s%-11s%-10s%s |\n","Node","Partitions","CPU","MEMORY","RATIO");
            System.out.println("+----------------------------------------------------+");
            for (int i = 0; i < noNode; i++) {
                System.out.println(nodes[i].toString());
            }
            System.out.println("+----------------------------------------------------+");

        } catch (IOException e){
            System.out.println("Error with file input");
        }


    }
}
