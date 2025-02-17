import java.util.Scanner;

public class DayOfWeekCalculator {

    // Method to determine if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to find the number of days passed in the current year until the given date
    private static int daysPassedInYear(int day, int month, int year) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (isLeapYear(year)) {
            daysInMonth[2] = 29; // Update February for leap year
        }

        int daysPassed = day; // Start with the days of the current month
        for (int i = 1; i < month; i++) {
            daysPassed += daysInMonth[i];
        }
        
        return daysPassed;
    }

    private static int totalOddDays(int year) {
        int oddDays = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
        return oddDays % 7;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input date from user
        System.out.println("Enter the date (dd mm yyyy): ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        // Calculate total odd days from years before the given year
        int oddDaysFromYears = totalOddDays(year);

        // Calculate days passed in the current year
        int daysPassed = daysPassedInYear(day, month, year);
        int oddDaysFromDaysPassed = daysPassed % 7;

        // Total odd days
        int totalOddDays = (oddDaysFromYears + oddDaysFromDaysPassed) % 7;

        // Determine the day of the week based on remainder
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayOfWeek = weekDays[totalOddDays];

        // Print the result
        System.out.println("The day of the week for the given date is: " + dayOfWeek);

        scanner.close();
    }
}
