

# Tutorial 3

#### Nor Badrul Anuar Bin Jumaat (WIC180000)

## Question 1 :

### Write statements for each of the following

### a. Determine wheter 3x8=27
```java
System.out.println(3*8 == 27);
```

### b. Determine whether an input integer is an odd number or even number. 
```java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Input an integer : ")
int number = input.nextInt();
if (number % 2 == 0)
    System.out.println("Even number");
else
    System.out.println("Odd number");
```

### c. Determine whether a character is a capital letter.  
```java
char character = 'C';  // test character
if (Character.isUpperCase(character)) 
    System.out.println(character + " is a capital letter.");
else 
    System.out.println(character + " is not a capital letter.");
```

### d. Display two strings in alphabetical order ignoring their case.
```java
String str1 = "Artificial";
String str2 = "Intelligence";
int comparison = str1.compareToIgnoreCase(str2);
if (comparison < 0)
    System.out.println(str1 + ", " + str2);
else
    System.out.println(str2 + ", " + str1);
```

### e. A switch statement that display Sunday, Monday, .., Satudary if the input is 0, 1, …, 6.
```java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Input your day number from 0 - 6 : ");
int dayNum = input.nextInt();
switch (dayNum){
    case 0:
        System.out.println("Sunday");
        break;
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    default:
        System.out.println("Please enter a valid number within 0 to 6");
}
```


## Question 2 :

### Correct the error for the following statements.

### a. 
```java
// wrong
if (num1 = num2)
    System.out.println("Number 1 is equal to number 2.");

// correct
if (num1 == num2)
    System.out.println("Number 1 is equal to number 2.");
```

### b.
```java
// wrong
if (x > y > z)
    System.out.println("x is the largest number");


// correct
if (x > y && y > z)
    System.out.println("x is the largest number");

```

### c.
```java
// wrong
String s1, s2;
if (s1==s2)
    System.out.println("They are equal strings.");
else (s1!=s2)
    System.out.println("They are not equal strings.");

// correct
String s1, s2;
if (s1.equals(s2))
    System.out.println("They are equal strings.");
else
    System.out.println("They are not equal strings.");
```

### d.
```java
// wrong
if x>0 or y>0;
 System.out.println("Either x or y is positive");

// correct
if (x>0 || y>0);
 System.out.println("Either x or y is positive");
```


## Question 3 :

### Write the output for the following statements when x=9 and y=10

### a.
```java
if (x < 10)
    if (y > 10)
        System.out.println("*****");
    else
        System.out.println("#####");
        System.out.println("$$$$$");
```
```output
> #####
  $$$$$
```

### b.
```java
if (x < 10) {
    if (y < 10)
        System.out.println("*****");
    else {
        System.out.println("#####");
        System.out.println("$$$$$");
    }
}
```
```output
> #####
  $$$$$
```

### c.
```java
if (x < 10) {
    if (y < 10)
        System.out.println("*****");
    System.out.println("#####");
} else {
    System.out.println("$$$$$");
}
```
```output
> #####
```

### d.
```java
if (x > 10) {
    if (y > 10) {
        System.out.println("*****");
        System.out.println("#####"); 
    } else
        System.out.println("$$$$$");
}
```
```output
> $$$$$
```


## Question 4 :

### Write the java statements that used the if statement to find the biggest number among three given integers.

```java
public class BiggestNumberAmong3Integers {
    public static void main(String[] args){
        int[] integers = {90, 20, 30};
        int max = integers[0];
        for(int i = 1; i < 3; i++){
            if (integers[i] > max)
                max = integers[i];
        }

        System.out.println("Biggest Number : " + max);
    }
}
```


## Question 5 :

### Write the java statements that determine whether the Leap year. A Leap year is divisible by 4 but not by 100. However, a Leap year is also divisible by 400.


```java
public class LeapYearDetector {
    public static void main(String[] args){
        int year = 2000;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("A Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}
```

