

# Tutorial 6

#### Nor Badrul Anuar Bin Jumaat (WIC180000)

## Question 1 :

### Write statements for each of the following

### a. Define a static method that returns the maximum number from 3 integer parameters.
```java
public static void biggest3(int a, int b, int c){
    if(a > b && a > c){
        return a;
    }
    else if(b > a && b > c){
        return b;
    }
    else {
        return c;
    }
}
```

### b. Define a static method that that determine whether the given integer is a square number.

```java
public static boolean squareDetector(int num){
    int low = 1;
    int high = num / 2 + 1;  // plus 1 so that 1 is also square number
    
    while(low <= high){
        int mid = (low + high) / 2;
        if (mid*mid == num){
            return true;
        }
        
        else if (mid*mid > num){
            high = mid - 1;
        }
        
        else {
            low = mid + 1;
        }
    }
    return false;
}
```

### c. Define a static method that use to compute combination function C(n,k). C(n,k) gives the number of different k-element subsets that can be found in a given set of n elements. C(n,k) = n! / (k! (n-k)!) 
```java
public static int combinationFunction(int n, int k){
    int combination = factorial(n) / (factorial(k) * factorial(n-k));
    return combination;
}

public static int factorial(int num) {
    int result = 1;
    for(int i = 2; i <= num; i++){
        result *= i;
    }
    return result;
} 
```

### d. Define a static method that used to determine whether the parameter is a pentagonal number. A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon. Pn = ½ n(3n -1)
```java
public static boolean pentagonalNumDetector(int num){
    int a = 3;
    int b = -1;
    int c = num*2;
    // Calculate the discriminant
    double discriminant = b * b - 4 * a * c;

    if (discriminant < 0) {
        // no root so confirm false
        return false;

    } else if (discriminant == 0) {
        double root = -b / (2 * a);
        if(isWholeNumber(root) && root > 0){
            return true;
        }

        
    } else {
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        if(isWholeNumber(root1) && root1 > 0){
            return true;
        }
        if(isWholeNumber(root2) && root2 > 0){
            return true;
        }

    }
    return false;
}

static boolean isWholeNumber(double number) {
    // Check if the number is close enough to an integer
    double epsilon = 1e-10;
    return Math.abs(number - Math.round(number)) < epsilon;
}
```

### e. Define a static method that displays the number of letters and the number of digits of a String parameter.
```java
public static letter_digit_sum(String str){
    int numOfDigit = 0;
    for(int i = 0; i < str.length(); i++){
        if(Character.isDigit(str.charAt(i))){
            numOfDigit++;
        }
    }
    System.out.println("Number of letters : " + str.length() - numOfDigit);
    System.out.println("Number of digits : " + numOfDigit);

}
```

### f. Define a static void method that generates 10 random numbers within 0 to 100 to the method’s parameter. The random numbers can be accessed by the main method. 
```java
import java.util.Random;

public class tuto6{
    public static void main(String[] args){
        int[] randomNumList = new int[10];
        generateRandomNo();
    }

    public static void generateRandomNo(){
        Random random = new Random();
        for(int ct = 0; ct < 10; ct++){
            randomNum[ct] = random.nextInt(101);
        }
    }
}
```

### g. Define a static method that returns the area and the circumference of a circle given the argument is radius. Area = πr2 and Circumference = 2 πr.
```java
public static double area(double radius){
    return (Math.PI * radius * radius);
}

public static double circumference(double radius){
    return (Math.PI * radius * 2);
}
```

### h. Define a static method that generate random number within 0 – 10. The method will return the first random number that generate twice. 
```java
import java.util.Random;
public static int randomNmberGeneratedTwice(){
    Random random = new Random();
    int[] numList = new int[11];

    while(true){
        int randomNum = random.nextInt(11);
        numList[randomNum]++;
        if(numList[randomNum] > 1){
            return randomNum;
        }
    }
}
```



## Question 2 :

### Write a program that consists of a method that can display three numbers in decreasing order.
```java
public class Tuto6 {
    public static void main(String[] args){
        descendingOrder(1,2,3);
    }

    public static void descendingOrder(int a, int b, int c){
        if(a > b && a > c){
            if(b > c)
                System.out.println("Desceding order : " + a + ", " + b + ", " + c);
            else
                System.out.println("Desceding order : " + a + ", " + c + ", " + b);
        }
        else if(b > a && b > c){
            if(a > c)
                System.out.println("Desceding order : " + b + ", " + a + ", " + c);
            else
                System.out.println("Desceding order : " + b + ", " + c + ", " + a);
        }
        else {
            if(a > b)
                System.out.println("Desceding order : " + c + ", " + a + ", " + b);
            else
                System.out.println("Desceding order : " + c + ", " + b + ", " + a);
        }
    }
}
```


