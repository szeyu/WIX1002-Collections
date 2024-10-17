import java.util.ArrayList;
import java.util.List;

class CourseStudent {
    private String courseCode;
    private String courseName;
    private int session;
    private int semester;
    private int mark;

    public CourseStudent(String courseCode, String courseName, int session, int semester, int mark) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.session = session;
        this.semester = semester;
        this.mark = mark;
    }

    public String getGrade(){
        if(this.mark >= 85)     return "A";
        if(this.mark >= 75)     return "A-";
        if(this.mark >= 70)     return "B+";
        if(this.mark >= 65)     return "B";
        if(this.mark >= 60)     return "B-";
        if(this.mark >= 55)     return "C+";
        if(this.mark >= 50)     return "C";
        if(this.mark >= 45)     return "D";
        if(this.mark >= 35)     return "E";
        return "F";
    }

    @Override
    public String toString() {
        return "Course{" + "\n"
                + "\t" + "courseCode = " + courseCode+ "\n" 
                + "\t" + "courseName = " + courseName + "\n" 
                + "\t" + "session = " + session + "\n" 
                + "\t" + "semester = " + semester + "\n" 
                + "\t" + "mark = " + mark + "\n" 
                + "\t" + "grade = " + this.getGrade() + "\n" 
                + '}';
    }
    
}

public class Student extends PersonProfile{
    private List<CourseStudent> courses;
    
    public Student(){
        super();
        this.courses = new ArrayList<>();
    }
    
    public Student(String name, char gender, String dateOfBirth){
        super(name, gender, dateOfBirth);
        this.courses = new ArrayList<>();
    }
    
    public void addCourse(CourseStudent course){
        courses.add(course);
    }

    public void display() {
        System.out.println(super.toString());
        for (CourseStudent course : courses){
            System.out.println(course.toString());
        }
    }
    
}
