import java.util.Scanner;

public class L04Q04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Define the days in each month from January to August
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31};

        // Check for leap year
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Leap Year");
            monthDays[1] = 29;
        }

        // Get the first day of the year (0 = Sunday, 6 = Saturday)
        int firstDay;
        do {
            System.out.print("Enter the first day of the year (0 for Sunday to 6 for Saturday): ");
            firstDay = input.nextInt();
        } while (firstDay < 0 || firstDay > 6);

        // Calculate the starting day of May and August
        int mayFirstDay = calculateFirstDay(firstDay, monthDays, 4);
        int augFirstDay = calculateFirstDay(firstDay, monthDays, 7);

        // Generate and print the calendar for May
        System.out.println("\nCalendar for May:");
        printCalendar("May", mayFirstDay, 31);

        // Generate and print the calendar for August
        System.out.println("\nCalendar for August:");
        printCalendar("August", augFirstDay, 31);
    }

    // Calculate the first day of a given month based on the starting day of the year
    private static int calculateFirstDay(int firstDay, int[] monthDays, int monthIndex) {
        int day = firstDay;
        for (int i = 0; i < monthIndex; i++) {
            day = (day + monthDays[i]) % 7;
        }
        return day;
    }

    // Print the calendar for a specified month with a given first day and total number of days
    private static void printCalendar(String monthName, int firstDay, int daysInMonth) {
        System.out.println(" __________________________________");
        System.out.printf("              %s             \n", monthName);
        System.out.println(" __________________________________");
        System.out.println("| Su | Mo | Tu | We | Th | Fr | Sa |");

        // Print initial spaces for days before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("     ");
        }

        // Print each day with proper formatting
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("  %2d ", day);

            // Move to a new line after Saturday (6th column)
            if ((firstDay + day) % 7 == 0) {
                System.out.println("");
            }
        }

        // Fill remaining spaces after the last day of the month to complete the week
        int remainingDays = (firstDay + daysInMonth) % 7;
        if (remainingDays != 0) {
            for (int i = remainingDays; i < 7; i++) {
                System.out.print("     ");
            }
            System.out.println("");
        }

        System.out.println(" __________________________________");
    }
}
