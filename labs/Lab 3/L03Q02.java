import java.util.Random;
public class L03Q02 {
    public static void main(String[] args){
        Random random = new Random();
        int randomVal = random.nextInt(6);
        String englishNaming = "";
        
        switch(randomVal){
            case 0:
                englishNaming = "zero";
                break;
            case 1:
                englishNaming = "one";
                break;
            case 2:
                englishNaming = "two";
                break;
            case 3:
                englishNaming = "three";
                break;
            case 4:
                englishNaming = "four";
                break;
            case 5:
                englishNaming = "five";
                break;
        }
        
        System.out.println(randomVal + " is " + englishNaming);
        
    }
}
