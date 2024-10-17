

# Tutorial 10

#### Nor Badrul Anuar Bin Jumaat (WIC180000)

## Question 1 :

### Create an abstract class DiscountPolicy. It has a single abstract method computeDiscount that return the discount for the purchase of a given number of item. The method has two parameters count and itemCost. Derived a class BulkDiscount from DiscountPolicy. It has a constructor that has two parameters minimum and discount rate. It has a method computeDiscount that compute the discount base on discount rate if the number of item more than minimum. Otherwise, no discount given. Derived a class OtherDiscount that compute the discount base on the table below

| N (Number of Items) | Discount |
|---------------------|----------|
| 1 - 2               | 0%       |
| 3 - 5               | 10%      |
| 6 - 8               | 20%      |
| >8                  | 30%      |

### Derived a class combineDiscount from DiscountPolicy. It has two parameters of type DiscountPolicy It has a method computeDiscount that return the maximum value returned by the computeDiscount for the two discount policies. Create a Tester class to test the program.

```java
abstract class DiscountPolicy{
    public abstract double computeDiscount(int count, double itemCost);
}

class BulkDiscount extends DiscountPolicy {
    private int minimum;
    private double discountRate;

    public BulkDiscount(int minimum, double discountRate){
        this.minimum = minimum;
        this.discountRate = discountRate;
    }

    public double computeDiscount(int count, double itemCost){
        // check if the number of item more than minimum
        if(count > minimum) {
            return itemCost * count * (1.0 - discountRate);
        }
        // else return no discount price
        return itemCost * count;
    }
}

class OtherDiscount extends DiscountPolicy {
    public double computeDiscount(int count, double itemCost){
        if(count > 8)           return 0.7 * count * itemCost; // 30% discount
        else if(count >= 6)     return 0.8 * count * itemCost; // 20% discount
        else if(count >= 3)     return 0.9 * count * itemCost; // 10% discount
        else                    return count * itemCost;
    }
}

class CombineDiscount extends DiscountPolicy {
    private DiscountPolicy policy1;
    private DiscountPolicy policy2;

    public CombineDiscount(DiscountPolicy policy1, DiscountPolicy policy2){
        this.policy1 = policy1;
        this.policy2 = policy2;
    }

    public double computeDiscount(int count, double itemCost){
        double discountPolicy1 = policy1.computeDiscount(count, itemCost);
        double discountPolicy2 = policy2.computeDiscount(count, itemCost);

        if(discountPolicy1 > discountPolicy2)
            return discountPolicy2; // mean policy2 more discount
        return discountPolicy1;
    }
}

public class Tester{
    public static void main(String[] args){
        DiscountPolicy policy1 = new BulkDiscount(3,0.15);
        DiscountPolicy policy2 = new OtherDiscount();
        DiscountPolicy maxPolicy = new CombineDiscount(policy1, policy2);

        System.out.printf("After Bulk Discount : RM %.2f%n",policy1.computeDiscount(10,1));
        System.out.printf("After Other Discount : RM %.2f%n",policy2.computeDiscount(10,1));
        System.out.printf("After Max Discount : RM %.2f%n",maxPolicy.computeDiscount(10,1));

    }
}
```

## Question 2 :

### Create an interface Interest that has a single method computeInterest that return the monthly interest based on the balance in the account. Create the SavingAccount that implement the interface, the class has an instance variable called balance. Define the method to compute interest. The interest rate for saving account is 0.5% per year. Create the FixedAccount that implement the interface. The class has an instance variable called balance. Define the method to compute interest. The interest rate for saving account is 3% per year. Create a Tester class to test the program.
```java
interface Interest{
    double computeInterest();
}

class SavingAccount implements Interest{
    private double balance;

    public SavingAccount(){
        this.balance = 0;
    }

    public SavingAccount(double balance){
        this.balance = balance;
    }

    public double computeInterest(){
        return (balance * 0.005) / 12;
    }
}

class FixedAccount implements Interest{
    private double balance;

    public FixedAccount(){
        this.balance = 0;
    }

    public FixedAccount(double balance){
        this.balance = balance;
    }

    public double computeInterest(){
        return (balance * 0.03) / 12;
    }
}

public class Tester{
    public static void main(String[] args){
        Interest balance1 = new SavingAccount(100);
        Interest balance2 = new FixedAccount(100);

        System.out.printf("Saving Account Balance : RM %.2f%n",balance1.computeInterest());
        System.out.printf("Fixed Account Balance : RM %.2f%n",balance2.computeInterest());
    }
}
```

## Question 3 :

### Create a class Person that implements the comparable interface. The class has an instance variable name. The class has the constructor that initializes the name. The class also has the accessor method and a display method to display the name. Create an array for multiple Person objects. Sort the person in ascending order. Create a Tester class to test the program.
```java
import java.util.Arrays;

class Person implements Comparable<Person>{
    private String name;
    
    public Person(){
        this.name = null;
    }
    
    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void display(){
        System.out.println("Name : " + name);
    }
    
    @Override
    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }
}

public class Tuto3 {
    public static void displayPeople(Person[] people){
        for (Person person : people){
            person.display();
        }
    }
    
    public static void main(String[] args) {
        Person[] people = new Person[3];
        people[0] = new Person("Charlie");
        people[1] = new Person("Alan");
        people[2] = new Person("Bob");
        
        System.out.println("Before sorting:");
        displayPeople(people);
        
        Arrays.sort(people);
        System.out.println();
        
        System.out.println("After sorting:");
        displayPeople(people);
    }
}
```