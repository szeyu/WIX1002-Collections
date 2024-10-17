

# Tutorial 7

#### Nor Badrul Anuar Bin Jumaat (WIC180000)

## Question 1 :

### Write statements for each of the following

### a. Store ten random integers within 0 to 1000 to a text file name integer.txt.
```java
import java.io.*;
import java.util.Random;

Random random = new Random();

try {
    PrintWriter out = new PrintWriter(new FileOutputStream("src/integer.txt"));
    for (int i = 0; i < 10; i++)
        out.println(random.next(1001));
    out.close();
} catch (IOException e) {
    System.out.println("Error with the file output");
}
```

### b. Read from the text file generated in a. Display all the integer and the largest integer. 

```java
import java.io.*;

int minimum = 100;
int maximum = 0;

try {
    Scanner in = new Scanner(new FileInputStream("src/integer.txt"));
    while(in.hasNextLine()){
        int number = in.nextInt();
        if(number < minimum)
            minimum = number;
        if(number > maximum)
            maximum = number;
    }
    in.close();
} catch(IOException e){
    System.out.println("Problem with file input");
}
System.out.println("Maximum : " + maximum);
System.out.println("Minimum : " + minimum);
```

### c. Store ten random integers within 0 to 1000 to a binary file name integer.dat
```java
import java.io.*;
import java.util.Random;

Random random = new Random();

try {
    ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/integer.dat"));
    for (int i = 0; i < 10; i++)
        out.writeInt(random.next(1001));
    out.close();
} catch (IOException e) {
    System.out.println("Error with the file output");
}
```

### d. Read from the binary file generated in a c. Display the all the integer and the average.
```java
import java.io.*;

int total = 0;
int ct = 0;

try {
    ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/integer.dat"));
    try {
        while(true){
            int number = in.readInt();
            total += number;
            ct++;
            System.out.println(number);
        }
        
    } catch (EOFException e) {
        break
    }
    
    out.close();
} catch (IOException e) {
    System.out.println("Error with the file output");
}
double average = (double) total / ct;
System.out.printf("Average: %.2f%n",average);
```


## Question 2 :

### Correct the error for the following statements.

### a. 
```java
// wrong
PrintWriter out = new PrintWriter(new FileOutputStream("d:\data\matrix.txt"));

// correct
PrintWriter out = new PrintWriter(new FileOutputStream("d:\\data\\matrix.txt"));
```

### b. 
```java
// wrong
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
    out.close();
} catch (FileNotFoundException e) {
    System.out.println("Problem with file output");
}

// correct
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
    out.close();
} catch (IOException e) {
    System.out.println("Problem with file output");
}
```

### c. 
```java
// wrong
int num;
Scanner a = new Scanner(new FileInputStream("data.dat"));
num = a.readInt();
a.close();

// correct
int num;
ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
num = a.readInt();
a.close();
```

### d. 
```java
// wrong
ObjectOutputStream o = new ObjectOutputStream (new
FileOutputStream("data.dat"));
o.print('A');
o.close();

// correct
ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
o.writeUTF("A");
o.close();
```


## Question 3 :

### Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it in a text file named data.txt. Then, read from the text file and display the sentence.

```java
import java.io.*;
import java.util.Scanner;

Scanner inputSentence = new Scanner(System.in);
        
try {
    PrintWriter w = new PrintWriter(new FileOutputStream("data.txt"));
    String sentence = "Hi";
    String ascii = "";

    for (int i = 0; i < sentence.length(); i++) {
        char letter = sentence.charAt(i);
        ascii += String.format("%08d", Integer.parseInt(Integer.toBinaryString(letter)));
    }

    w.print(ascii);
    w.close();
} catch(IOException e){
    System.out.println("The file cannot be written.");
}

try{
    Scanner scanner = new Scanner(new FileInputStream("data.txt"));

    int code = 0;
    String num = "";

    while(scanner.hasNextLine()){

        num += scanner.next();
    }

    System.out.println(num);
    String wholeSentence = "";
    for(int i = 0; i<num.length(); i+=8) {
        code = 0;
       for(int j = i, z = 7; j<i+8; j++, z--){
           code+=Integer.parseInt(String.valueOf(num.charAt(j))) * Math.pow(2, z);
       }
        char print = (char)code;
        wholeSentence += print;
    }

    System.out.println(wholeSentence);

    scanner.close();
}catch(IOException e){
    System.out.println("File is not available");
}
```
