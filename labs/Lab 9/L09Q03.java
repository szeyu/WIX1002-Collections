import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class L09Q03 {
    public static void main(String[] args) {
        Lecturer lec1 = new Lecturer("Sim",'M',"2004-04-17");
        
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/Week11/lecturer.txt"));
            
            String courseCode;
            while((courseCode = in.readLine()) != null){
                String courseName = in.readLine();
                int session = Integer.parseInt(in.readLine());
                int semester = Integer.parseInt(in.readLine());
                int creditHour = Integer.parseInt(in.readLine());
                int numberOfStudentsRegistered = Integer.parseInt(in.readLine());
                
                CourseLec course = new CourseLec(courseCode, courseName, session, semester, creditHour, numberOfStudentsRegistered);
                lec1.addCourse(course);
            }
            
        } catch(FileNotFoundException ex){
            System.out.println("File not found : " + ex.getStackTrace());
        } catch(IOException ex){
            System.out.println("Problem with file input : " + ex.getStackTrace());
        }
        
        System.out.println("Before updating credit hour:");
        lec1.display();
        System.out.println();
        lec1.updateEveryCreditHour();
        System.out.println("After updating credit hour:");
        lec1.display();
    }
}
