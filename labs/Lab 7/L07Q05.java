import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class L07Q05 {
    private String name;
    private int age;
    private char gender;
    
    public L07Q05(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Week09/Lab07/person.dat"));
            int TotalNumberofRecord = in.readInt(); 
            ArrayList<L07Q05> people = new ArrayList<>();
            
            for(int ct = 0; ct < TotalNumberofRecord; ct++){
                String Name = in.readUTF();
                int Age = in.readInt();
                char Gender = in.readChar();
                L07Q05 person = new L07Q05(Name, Age, Gender);
                people.add(person);
            }
            in.close();
            
            System.out.println("Before Sort:");
            printPeople(people);
            sortPeople(people);
            
            System.out.println();
            
            System.out.println("After Sort:");
            printPeople(people);
            
        } catch(IOException e){
            System.out.println("Error with file input");
        }
    }
    
    private static void sortPeople(ArrayList<L07Q05> people){
        for (int i = 0; i < people.size(); i++){
            for(int j = 0; j < people.size() - i - 1; j++){
                if(people.get(j).name.compareTo(people.get(j+1).name) > 0){
                    Collections.swap(people, j, j+1);
                }
            }
        }
    }
    
    private static void printPeople(ArrayList<L07Q05> people){
        for (L07Q05 person : people){
            System.out.print(person.name + " ");
            System.out.print(person.age + " ");
            System.out.println(person.gender);
        }
    }
}
