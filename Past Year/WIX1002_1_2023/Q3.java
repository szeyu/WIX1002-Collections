package WIX1002_1_2023;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

class DataBuoy{
    protected String buoy_id;
    protected int latitude;
    protected int longitude;
    protected double air_t;
    protected double water_t;

    public DataBuoy(String buoy_id, int latitude, int longitude, double air_t, double water_t) {
        this.buoy_id = buoy_id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.air_t = air_t;
        this.water_t = water_t;
    }


    @Override
    public String toString(){
        return String.format("%-16s%-10d%-10d%-10s%s",buoy_id,latitude,longitude,air_t,water_t);
    }

}



public class Q3 {
    public static void main(String[] args) {
        String inputFile = "src/WIX1002_1_2022/ocean_data.csv";
        DataBuoy[] data = new DataBuoy[25];
        float avg_water_temp;
        loadData(inputFile, data);
        showData(data);

        avg_water_temp = calculateAvgWaterTemp(data);
        System.out.println("\nAverage water temperature is " + avg_water_temp);
        printMap(data, avg_water_temp);

    }

    public static void loadData(String inputFile, DataBuoy[] data){
        try{
            Scanner input = new Scanner(new FileInputStream(inputFile));
            String line;
            String[] extract;

            for (int i = 0; i < data.length; i++) {
                line = input.nextLine();
                extract = line.split(",");
                data[i] = new DataBuoy(extract[0],
                        Integer.parseInt(extract[1]),
                        Integer.parseInt(extract[2]),
                        Double.parseDouble(extract[3]),
                        Double.parseDouble(extract[4]));
            }

        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }

    public static void showData(DataBuoy[] data){
        System.out.println("Data read from buoy:");
        System.out.printf("%-16s%-10s%-10s%-10s%s\n","buoy_id","lat","long","air_t","water_t");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
        }
    }

    public static float calculateAvgWaterTemp(DataBuoy[] data){
        float sum = 0;
        float average;
        for (int i = 0; i < data.length; i++) {
            sum += (float) data[i].water_t;
        }

        average = sum / 25;
        return average;
    }

    public static void printMap(DataBuoy[] data, float avg_water_temp){
        String[][] map = new String[21][21];
        // set all to ~
        for (int longitude = 0; longitude < 21; longitude++) {
            for (int latitude = 0; latitude < 21; latitude++) {
                map[longitude][latitude] = "~";
            }
        }

        // set null island
        map[10][10] = "N";

        for (int i = 0; i < 25; i++) {
            String status = "";
            int longitude, latitude;
            longitude = data[i].longitude + 10;
            latitude = data[i].latitude + 10;

            if((float) data[i].water_t > avg_water_temp){
                map[latitude][longitude] = "H";
            } else if((float) data[i].water_t < avg_water_temp){
                map[latitude][longitude] = "C";
            } else{
                map[latitude][longitude] = "A";
            }
        }


        //print the map
        System.out.println();
        System.out.println("Heat Map of water temperature");

        for (int longitude = 20; longitude >= 0; longitude--) {
            for (int latitude = 0; latitude < 21; latitude++) {
                System.out.print(map[longitude][latitude]);
            }
            System.out.println();
        }

    }
}
