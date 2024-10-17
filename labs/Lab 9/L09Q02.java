import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class L09Q02 {
    public static void main(String[] args) {
        Student studentA = new Student("Sim",'M',"2004-04-17");
        
        try {
            BufferedReader in = new BufferedReader(new FileReader("src/Week11/course.txt"));
            
            String courseCode;
            while((courseCode = in.readLine()) != null){
                String courseName = in.readLine();
                int session = Integer.parseInt(in.readLine());
                int semester = Integer.parseInt(in.readLine());
                int mark = Integer.parseInt(in.readLine());
                
                CourseStudent course = new CourseStudent(courseCode, courseName, session, semester, mark);
                studentA.addCourse(course);
            }
            
        } catch(FileNotFoundException ex){
            System.out.println("File not found : " + ex.getStackTrace());
        } catch(IOException ex){
            System.out.println("Problem with file input : " + ex.getStackTrace());
        }
        
        studentA.display();
    }
}
