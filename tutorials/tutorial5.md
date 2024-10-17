

# Tutorial 5

#### Nor Badrul Anuar Bin Jumaat (WIC180000)

## Question 1 :

### Write statements for each of the following

### a. Declare an array that used to store 12 floating point numbers.
```java
float[] floatArray = new float[12];
```

### b. Initialize an array that used to store the value of A to E.
```java
char[] charArray = {'A', 'B', 'C', 'D', 'E'};
```

### c. Declare an array that used to store 100 students name.
```java
String[] strArray = new String[100];
```

### d. Declare an array for a table with 6 rows 2 columns that used to store integer value.
```java
int[][] intMatrix = new int[6][2];
```

### e. Initialize an array with the following value:
```java
int[][] matrix = {{6, 9},
                  {2, 5},
                  {4, 6}};
```

### f. After initialize the array, modify the value of the above array to 
```java
matrix[1][1] = 4;
matrix[2][0] = 3;
matrix[2][1] = 7;
```

### g. Display all the values of an array name contact in separate lines.
```java
for(String name : contactList){
    System.out.println(name);
}
```


## Question 2 :

### Correct the error for the following statements.

### a. 
```java
// wrong
String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};

// correct
String[] code = {"AAA", "AAB", "AAC", "AAD"};
```

### b.
```java
// wrong
int[] num = new num[10];
for(int k=0; k<=num.length(); k++)
   sum+=num;

// correct
int[] num = new num[10];
for(int k=0; k < num.length; k++)
   sum += num[k];
```

### c.
```java
// wrong
int [][]t = new int[3][];
t[1][2] = 5;

// correct
int[][] t = new int[3][];
t[1] = new int[3];
t[1][2] = 5;
```

### d.
```java
// wrong
int i=4;
int []score = new int[5];
score [1] = 78;
score[++i] = 100;

// correct
int i = 4;
int[] score = new int[6];
score[1] = 78;
score[++i] = 100;
```


## Question 3 :

### Determine the values of each element of array marks. Assume the array was declared as:
```java
int[] marks = new int[5];
int i = 0, j = 1;
marks[i] = 12;
marks[j] = marks[i] + 19;
marks[j-1] = marks[j] * marks [j];
marks[j*3] = marks[i+1];
marks[++j] = marks[i]%5;
marks[2*j] = marks[j-1];
```

```java
mark[0] = 961
mark[1] = 31
mark[2] = 1
mark[3] = 31
mark[4] = 31
```


## Question 4 :

### Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence.
```java
String sentence = "I am the best of the best";
String[] arraySentence = sentence.split(" ");

int totalThe = 0;
for (String word : arraySentence){
    if(word.equals("the")){
        totalThe++;
    }
}
System.out.println("The total of \"the\" in the sentence : " + totalThe);
```

## Question 5 :

### Write the statements that display the string array name sentence in reverse order. Each string element must be displayed in reverse order as well.
```java
String sentence = "I am the best of the best";
String[] arraySentence = sentence.split(" ");

for(int i = arraySentence.length-1; i >= 0; i--){
    for(int j = arraySentence[i].length()-1; j >= 0; j--){
        System.out.print(arraySentence[i].charAt(j));
    }
    System.out.println();
}
```

## Question 6 :

### Write the statements that generate 1 random integer within 0 – 255. Convert the number to binary and store the bit into an 8 bit array. Then, display the binary number.
```java
import java.util.Random;
Random random = new Random();
int randomInt = random.nextInt(256);
System.out.println("Random Integer Generated : " + randomInt);

int[] bit8Array = new int[8];

int bitPosition = 7;
while(bitPosition >= 0){
    bit8Array[bitPosition] = randomInt % 2;
    randomInt /= 2;
    bitPosition--;
}

System.out.print("In Binary Form : ");
for(int i = 0; i < 8; i++){
    System.out.print(bit8Array[i]);
}
```

