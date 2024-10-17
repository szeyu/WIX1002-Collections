

# Tutorial 4

#### Nor Badrul Anuar Bin Jumaat (WIC180000)

## Question 1 :

### Write statements for each of the following

### a. Find the largest integer n so that n^3 is less than 2000.
```java
for(int n = 1; ; n++){
    if (n*n*n > 2000)
        break;
}
System.out.println("Largest integer n so that n^3 is less than 2000 :" + n-1);
```

### b. Display the square number of the first twelve integers starting from 1.
```java
for(int i = 1; i <= 12; i++){
    System.out.println(i + "^2 = " + i*i);
}
```

### . Display a 4-by-5 matrix using random number within 0 to 100.
```java
import java.util.Random;
Random random = new Random();
for(int row = 0; row < 4; row++){
    System.out.println();
    for(int column = 0; column < 5; column++){
        int randomNumber = random.nextInt(101);
        System.out.printf("%-3s", randomNumber);
    }
}
```

### d. Compute the sum of numbers from 1 to a given number.
```java
import java.util.Scanner;
Scanner input = new Scanner(System.in);
System.out.print("Number n : ")
int number = input.nextInt();
int sum = 0;
for(int i = 1; i <= number; i++){
    sum += i;
}
System.out.println("The sum of numbers from 1 to n : is " + sum)
```

### e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
```java
int sum = 0;
for(int i = 1; i <= 25; i++){
    sum += (double)i/(26-i);
}
```


## Question 2 :

### Correct the error for the following statements.

### a. 
```java
// wrong
for (x = 10; x > 0; x++)
    sum += x;

// correct
for (int x = 10; x > 0; x--)
    sum += x;
```

### b.
```java
// wrong
do
    x += 2;
    y += x;
    System.out.println(x + " and " + y);
while (x < 100)


// correct
int x = 0;
int y = 0;
do {
    x += 2;
    y += x;
    System.out.println(x + " and " + y);
} while (x < 100);

```

### c.
```java
// wrong
for ( x==1, y==20; x < y, x++, y-=2);
    System.out.println(x & " " & y);

// correct
for ( int x = 1, int y = 20; x < y, x++, y-=2)
    System.out.println(x + " " + y);
```

### d.
```java
// wrong
i =1;
while(i<10) {
    if (i==10)
    System.out.println("Program End");
}


// correct
int i = 1 ;
while(i < 10) {
    i++;
    if (i == 10)
        System.out.println("Program End");
}
```


## Question 3 :

### Write the statements that display the first ten values of the Fibonacci sequence. Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2

```java
int f1 = 1;
int f2 = 1;
System.out.print(f1 + ", " + f2 + ", ");

int ct = 2;
while (ct < 10){
    int f_next = f1 + f2;
    System.out.print(f_next + ", ");
    f1 = f2;
    f2 = f_next; 
    ct++;
}

System.out.print(f1 + f2);
```


## Question 4 :

### Write the statements that display the string in reverse order. (use String.length() to get the length of the string)
```java
String string = "Artificial Intelligence";
String reversedStr = "";

for(int i = string.length()-1; i >= 0; i--){
    reversedStr += string.charAt(i);
}

System.out.println("Reversed String : " + reversedStr);
```
