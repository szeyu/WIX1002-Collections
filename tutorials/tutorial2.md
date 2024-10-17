
# Tutorial 2

#### Nor Badrul Anuar Bin Jumaat (WIC180000)

## Question 1 :

### Display the sentence Faculty of Computer Science and Information Technology.

### a. In one line using multiple Java statements
```java
System.out.println("Faculty of Computer Science and Information Technology.");
```

### b. In multiple lines using one Java statement
```java
System.out.println("Faculty of\nComputer Science and\nInformation Technology.");
```


## Question 2 :

### Write a Java statement that print "SDN" - Software-defined networking.

```java
System.out.println("SDN - Software-defined networking");
```


## Question 3 :

### Correct the error for the following statements.

### a. 
```java
// wrong
System.Println("Java Programming");

// correct
System.out.println("Java Programming");
```

### b.
```java
// wrong
System.in.println("Introduction to Java!")

// correct
System.out.println("Introduction to Java!");
```

### c.
```java
// wrong
System.out.println("\t is the horizontal tab character");

// correct
System.out.println("\\t is the horizontal tab character");
```

### d.
```java
// wrong
system.out.println("Java is case sensitive!" );

// correct
System.out.println("Java is case sensitive!" );
```


## Question 4 :

### Write statements for each of the following

### a. Declare a variable that used to store the value of a matric number.
```java
String matricNo = "23005023";
```

### b. Declare a variable that used to store the value of π. 
```java
double pi = 3.1415;
```

### c. Initialize a variable named M with the value set to false.
```java
boolean M = false;
```

### d. Initialize a variable named P with the value set to 8800000000.
```java
long P = 8800000000L;
```

### e. Initialize a variable named letter with the value set to U.
```java
char letter = 'U';
```

### f. Declare a constant variable named PRO. The value of the constant variable is Java. 
```java
final String PRO = "Java";
```


## Question 5 :

### Correct the error for the following statements.

### a. 
```java
// wrong
final double AMOUNT = "32.5";
AMOUNT += 10;
System.out.println("The amount is " + AMOUNT);

// correct
double AMOUNT = 32.5;
AMOUNT += 10;
System.out.println("The amount is " + AMOUNT);
```

### b.
```java
// wrong
string chapter = 'Summary';
System.out.println(chapter);

// correct
String chapter = "Summary";
System.out.println(chapter);
```

### c.
```java
// wrong
int num;
++num++;
num1 = num;

// correct
int num;
num++;
int num1 = num;
```

### d.
```java
// wrong
int num = 3000;
System.out.printf("%4.2f\n", num);

// correct
int num = 3000;
System.out.printf("%4.2f\n", (double)num);
```

### e.
```java
// wrong
String contact;
Scanner keyboard = new Scanner(System.out);
contact = keyboard.nextLine();

// correct
String contact;
Scanner keyboard = new Scanner(System.in);
contact = keyboard.nextLine();
```


## Question 6 :

### Write a java program that print the circumference of a circle. The input of the program is diameter. Display the result in three decimal places. (Note pi = Math.PI)


```java
import java.util.Scanner;
public class Diameter2Circumference {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Diameter: ");
        double diameter = input.nextDouble();
        System.out.println();
        
        double circumference = diameter * Math.PI;
        System.out.printf("The circumference of the circle is : %.3f%n", circumference);
    }
}
```


## Question 7 :

### Write a java program that converts inches to meters. (Given 1 inch equals to 2.54 centimeters). Print the output in two decimal places.


```java
import java.util.Scanner;
public class Inch2Meter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in inch: ");
        double inch = input.nextDouble();
        System.out.println();
        
        double meter = inch * 2.54;
        System.out.printf("%.2f inches = %.2f meters%n", inch, meter);
    }
}
```

