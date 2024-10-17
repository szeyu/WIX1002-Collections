import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

public class L07Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        writeDatFile();
        System.out.print("Course code : ");
        String courseCode = input.next();
        readDatFile(courseCode);
        input.close();
    }
    
    public static void writeDatFile(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/Week09/Lab07/course.dat"))){
            out.writeUTF("Course Code,Course Name");
            out.writeUTF("WXES1116,Programming I");
            out.writeUTF("WXES1115,Data Structure");
            out.writeUTF("WXES1110,Operating System");
            out.writeUTF("WXES1112,Computing Mathematics I");
            
            //System.out.println("Data written to course.dat successfully.");
            out.close();
            
        } catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
    
    public static void readDatFile(String courseCode){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/Week09/Lab07/course.dat"))){
            boolean flag = false;
            while(true){
                try {
                    String line = in.readUTF();
                    //System.out.println(line);
                    // System.out.println(line.substring(0,8));
                    if (line.substring(0,8).equals(courseCode)){
                        System.out.println(line.substring(9));
                        flag = true;
                        break;
                    }
                } catch (EOFException e){
                    break;
                }
            }
            in.close();
            
            if (!flag){
                System.out.println("Course Not Found");
            }
                        
        } catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
}
