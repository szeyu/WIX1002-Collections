import java.util.ArrayList;
import java.util.List;

class CourseLec {
    private String courseCode;
    private String courseName;
    private int session;
    private int semester;
    private double creditHour;
    private int numberOfStudentsRegistered;

    public CourseLec(String courseCode, String courseName, int session, int semester, double creditHour, int numberOfStudentsRegistered) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.session = session;
        this.semester = semester;
        this.creditHour = creditHour;
        this.numberOfStudentsRegistered = numberOfStudentsRegistered;
    }
    
    public void updateCreditHour(){
        if(this.numberOfStudentsRegistered >= 150){
            this.creditHour *= 3;
        }
        else if(this.numberOfStudentsRegistered >= 100){
            this.creditHour *= 2;
        }
        else if(this.numberOfStudentsRegistered >= 50){
            this.creditHour *= 1.5;
        }
    }

    @Override
    public String toString() {
        return "Course{" + "\n"
                + "\t" + "courseCode = " + courseCode+ "\n" 
                + "\t" + "courseName = " + courseName + "\n" 
                + "\t" + "session = " + session + "\n" 
                + "\t" + "semester = " + semester + "\n" 
                + "\t" + "credit hour = " + creditHour + "\n" 
                + "\t" + "number of student registered = " + numberOfStudentsRegistered + "\n" 
                + '}';
    }
    
}

public class Lecturer extends PersonProfile{
    private List<CourseLec> courses;
    
    public Lecturer(){
        super();
        this.courses = new ArrayList<>();
    }
    
    public Lecturer(String name, char gender, String dateOfBirth){
        super(name, gender, dateOfBirth);
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(CourseLec course){
        courses.add(course);
    }
    
    public void updateEveryCreditHour(){
        for(CourseLec course : courses){
            course.updateCreditHour();
        }
    }

    public void display() {
        System.out.println(super.toString());
        for (CourseLec course : courses){
            System.out.println(course.toString());
        }
    }
    
}
