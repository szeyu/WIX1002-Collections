import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonProfile {
    final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    private String name;
    private char gender;
    private LocalDate dateOfBirth;

    public PersonProfile() {
        this.name = null;
        this.gender = '\u0000';
        this.dateOfBirth = LocalDate.now();
    }

    public PersonProfile(String name, char gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = LocalDate.parse(dateOfBirth, dtf);
    }   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = LocalDate.parse(dateOfBirth, dtf);
    }

    @Override
    public String toString() {
        return "PersonProfile{" 
                + "name = " + name 
                + ", gender = " + gender 
                + ", dateOfBirth = " + dateOfBirth + '}';
    }
}
