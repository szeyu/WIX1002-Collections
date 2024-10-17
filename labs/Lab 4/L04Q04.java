import java.util.Scanner;
public class L04Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        
        int nlydays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (year%4 ==0 && year%100!=0|| year%400==0){ //leap year
            nlydays[1] = 29;
        
        
            int day;
            do{
              System.out.print("Enter the first day of the year (0 fo Sunday, 1 for Monday,...,6 for Saturday): ");
              day = input.nextInt();
              }while( day <0 || day>6);
        
              //Find may first day when leap year
              int mayfirst = day;
              for(int i=0;i<=4;i++){
                mayfirst = (mayfirst+nlydays[i])%7; 
              }
        
              //Find aug first day when leap year
              int augfirst = day;
              for(int j=0;j<=7;j++){
                augfirst = (augfirst+nlydays[j])%7;  
              }
              
              //print may calendar when leap year
              System.out.println("");
              System.out.printf("%12s%s\n","","Calendar");
              System.out.printf("%12s%d%s\n","",year," MAY");
              System.out.println("---------------------------------");
              System.out.printf("%3s  %3s  %3s  %3s  %3s  %3s  %3s\n","SUN","MON","TUE","WED","THU","FRI","SAT");
              System.out.println("---------------------------------");
              for(int i=1;i< mayfirst ;i++){
              System.out.printf("%5s","");
              }
              for(int mayday =1; mayday<=nlydays[4]; mayday++ ){
                if (mayday/10==0)
                System.out.printf("%d%4s",mayday,"");
                else
                System.out.printf("%d%3s",mayday,"");
                if ((mayfirst + mayday - 1) % 7 == 0) {
                    System.out.println();
                    }
                }
              System.out.println("");
              System.out.println("");//spacing and prepare to print calendar Aug
              System.out.println("");
              
              //Print Aug calendar whn leap year
              System.out.println("");
              System.out.printf("%12s%s\n","","Calendar");
              System.out.printf("%12s%d%s\n","",year," AUG");
              System.out.println("---------------------------------");
              System.out.printf("%3s  %3s  %3s  %3s  %3s  %3s  %3s\n","SUN","MON","TUE","WED","THU","FRI","SAT");
              System.out.println("---------------------------------");
              
              for(int i=1;i< augfirst ;i++){
              System.out.printf("%5s","");
              }
              for(int augday =1; augday<=nlydays[7]; augday++ ){
                if (augday/10==0)
                System.out.printf("%d%4s",augday,"");
                else
                System.out.printf("%d%3s",augday,"");
                if ((augfirst + augday - 1) % 7 == 0) {
                    System.out.println();
                    }
                }
                System.out.println("");
                System.out.println("");//spacing and prepare to print calendar Aug
                System.out.println("");

        }
        else{ //not leap year
       
            int day;
            do{
              System.out.print("Enter the first day of the year (0 fo Sunday, 1 for Monday,...,6 for Saturday): ");
              day = input.nextInt();
              }while( day <0 || day>6);
        
              //Find may first day when not leap year
              int mayfirst = day;
              for(int i=0;i<4;i++){
                mayfirst = (mayfirst+nlydays[i])%7; 
              }
        
              //Find aug first day when not leap year
              int augfirst = day;
              for(int j=0;j<7;j++){
                augfirst = (augfirst+nlydays[j])%7;  
              }
              
              //print may calendar when not leap year
              System.out.println("");
              System.out.printf("%12s%s\n","","Calendar");
              System.out.printf("%12s%d%s\n","",year," MAY");
              System.out.println("---------------------------------");
              System.out.printf("%3s  %3s  %3s  %3s  %3s  %3s  %3s\n","MON","TUE","WED","THU","FRI","SAT","SUN");
              System.out.println("---------------------------------");
              for(int i=1;i< mayfirst ;i++){
              System.out.printf("%5s","");
              }
              for(int mayday =1; mayday<=nlydays[4]; mayday++ ){
                if (mayday/10==0)
                System.out.printf("%d%4s",mayday,"");
                else
                System.out.printf("%d%3s",mayday,"");
                if ((mayfirst + mayday - 1) % 7 == 0) {
                    System.out.println();
                    }
                }
              System.out.println("");
              System.out.println("");//spacing and prepare to print calendar Aug
              System.out.println("");
              
              //Print Aug calendar when not leap year
              System.out.println("");
              System.out.printf("%12s%s\n","","Calendar");
              System.out.printf("%12s%d%s\n","",year," AUG");
              System.out.println("---------------------------------");
              System.out.printf("%3s  %3s  %3s  %3s  %3s  %3s  %3s\n","MON","TUE","WED","THU","FRI","SAT","SUN");
              System.out.println("---------------------------------");
              
              for(int i=1;i< augfirst ;i++){
              System.out.printf("%5s","");
              }
              for(int augday =1; augday<=nlydays[7]; augday++ ){
                if (augday/10==0)
                System.out.printf("%d%4s",augday,"");
                else
                System.out.printf("%d%3s",augday,"");
                if ((augfirst + augday - 1) % 7 == 0) {
                    System.out.println();
                    }
                }
                System.out.println("");
                System.out.println("");//spacing and prepare to print calendar Aug
                System.out.println("");
        }
        input.close();
    }
}