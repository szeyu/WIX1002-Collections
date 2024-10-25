package WIX1002_1_2020;

import java.lang.Math;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter Location 1");
        double[] location1 = input();

        System.out.println("Enter Location 2");
        double[] location2 = input();

        System.out.printf("Location 1 : %.6f Latitude , %.6f Longitude%n", location1[0], location1[1]);
        System.out.printf("Location 2 : %.6f Latitude , %.6f Longitude%n", location2[0], location2[1]);

        System.out.printf("Distance : %.2f KM%n", distance(location1,location2));
    }

    public static double[] input(){
        boolean latitude = false, longitude = false;
        double[] location = new double[2]; // 0.latitude 1.longitude

        Scanner input = new Scanner(System.in);

        while (!(latitude && longitude)){
            System.out.print("Enter Direction: [N, S, E, W]: ");
            String direction = input.next();

            System.out.print("Enter Degree, Minute and Second: ");
            int degree = input.nextInt();
            int minute = input.nextInt();
            int second = input.nextInt();

            if (direction.equalsIgnoreCase("N") || direction.equalsIgnoreCase("S")){
                latitude = true;
                location[0] = decimalDegree(direction, degree, minute, second);
            } else if (direction.equalsIgnoreCase("E") || direction.equalsIgnoreCase("W")){
                longitude = true;
                location[1] = decimalDegree(direction, degree, minute, second);
            }

        }

        return location;

    }

    public static double decimalDegree(String direction, int degree, int minute, int second){
        if(direction.equals("N") || direction.equals("E")){
            return degree + (double)(minute*60 + second)/3600;
        } else{
            return -1*(degree + (double)(minute*60 + second)/3600);
        }
    }

    public static double distance(double[] location1, double[] location2){
        double deltaLatitude = Math.toRadians(Math.abs(location1[0] - location2[0]));
        double deltaLongitude = Math.toRadians(Math.abs(location1[1] - location2[1]));
        double a = Math.pow(Math.sin(deltaLatitude/2),2) +
                Math.cos(Math.toRadians(location1[0])) * Math.cos(Math.toRadians(location2[0])) *
                        Math.pow(Math.sin(deltaLongitude/2),2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = 6371 * c;

        return d;
    }
}
