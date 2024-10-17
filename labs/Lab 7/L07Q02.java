import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.net.URLConnection;
import java.io.IOException;
import java.io.PrintWriter;

public class L07Q02 {
    public static void main(String[] args) {
        try{
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            PrintWriter out = new PrintWriter(new FileOutputStream("src/Week09/Lab07/index.htm"));
            String line;
            while(in.hasNextLine()){
                line = in.nextLine();
                out.println(line);
            }
            
            in.close();
            out.close();
            
            
        } catch (IOException e){
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
