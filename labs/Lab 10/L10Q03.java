import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

class ShuffleCipher implements MessageEncoder{
    private String inputFileName;
    private String outputFileName;
    private int N;

    public ShuffleCipher(String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }
    
    public String readFile(){
        String text = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader("src/Week12/"+inputFileName));
            text = in.readLine();
//            System.out.println("Text: " + text);
            in.close();
            return text;
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e){
            System.out.println("Problem with input");
        }
        
        return text;
    }
    
    // Overload
    public String readFile(String inputFileName){
        String text = "";
        try{
            BufferedReader in = new BufferedReader(new FileReader("src/Week12/"+inputFileName));
            text = in.readLine();
//            System.out.println("Text: " + text);
            in.close();
            return text;
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e){
            System.out.println("Problem with input");
        }
        
        return text;
    }
    
    public void writeFile(String text){
        try{
            BufferedWriter out = new BufferedWriter(new FileWriter("src/Week12/"+outputFileName));
            out.write(text);
            System.out.println("File Written Successfully");
            out.close();
        } catch (FileNotFoundException e){
            System.out.println("File Not Found");
        } catch (IOException e){
            System.out.println("Problem with input");
        }
    }
    
    // base initiator
    public void encode(){
        String text = readFile();
        System.out.println("Text: " + text);
        encode(text);
        System.out.println();
        encodeRecursive(N-1);
    }
    
    public void encodeRecursive(int N){
        // read from the outputFile again
        String text = readFile(outputFileName);
        
        if(N > 0) {

            System.out.println("Text: " + text);
            encode(text);
            System.out.println();
            encodeRecursive(N-1);
        }
    }
    
    public void encode(String plainText){
        System.out.println("Plain Text: " + plainText);
        StringBuilder encryptedMessage = new StringBuilder();
        
        if(plainText.length() > 3){
            // find the half index
            int halfIndex = plainText.length() / 2;
            for (int i = 0; i < halfIndex; i++) {
                encryptedMessage.append(plainText.charAt(i));
                encryptedMessage.append(plainText.charAt(i+halfIndex));
            }
        } else {
            // no changes
            encryptedMessage.append(plainText);
        }
        
        // if odd length then add the last one to the end
        if(plainText.length() % 2 == 1)
            encryptedMessage.append(plainText.charAt(plainText.length()-1));
        
        System.out.println("Encrypted Text: " + encryptedMessage.toString());
        writeFile(encryptedMessage.toString());
    }
    
    // base initiator
    public void decode(){
        String text = readFile();
        System.out.println("Text: " + text);
        decode(text);
        System.out.println();
        decodeRecursive(text.length()/2 - (N % (text.length()/2 - 1) - 1));
    }
    
    public void decodeRecursive(int N){
        // read from the outputFile again
        String text = readFile(outputFileName);
        
        if(N > 0) {

            System.out.println("Text: " + text);
            decode(text);
            System.out.println();
            decodeRecursive(N-1);
        }
    }
    
    public void decode(String cipherText){
        System.out.println("cipher Text: " + cipherText);
        StringBuilder decryptedMessage = new StringBuilder();
        
        if(cipherText.length() > 3){
            // find the half index
            int halfIndex = cipherText.length() / 2;
            for (int i = 0; i < halfIndex; i++) {
                decryptedMessage.append(cipherText.charAt(i));
                decryptedMessage.append(cipherText.charAt(i+halfIndex));
            }
        } else {
            // no changes
            decryptedMessage.append(cipherText);
        }
        
        // if odd length then add the last one to the end
        if(cipherText.length() % 2 == 1)
            decryptedMessage.append(cipherText.charAt(cipherText.length()-1));
        
        System.out.println("Decrypted Text: " + decryptedMessage.toString());
        writeFile(decryptedMessage.toString());
    }
    
}

public class L10Q03 {
    public static void main(String[] args) {
        MessageEncoder encrypt = new ShuffleCipher("messageSend.txt", "messageReceived.txt", 10);
        encrypt.encode();
        MessageEncoder decrypt = new ShuffleCipher("messageReceived.txt", "messageSend.txt", 10);
        decrypt.decode();
    }
}
