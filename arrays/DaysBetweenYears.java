// The public class should be in a file named DaysBetweenYears.java, not daysBetweenYears.java
class DaysBetweenYears {
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }
    
    // Method to calculate days between two consecutive years
    public static int daysBetweenConsecutiveYears(int year1, int year2) {
        // Ensure year2 is consecutive to year1
        if (year2 != year1 + 1) {
            System.out.println("Years must be consecutive!");
            return -1;
        }
        
        // Check if either year is a leap year
        boolean year1IsLeap = isLeapYear(year1);
        boolean year2IsLeap = isLeapYear(year2);
        
        // Calculate total days
        int daysInYear1 = year1IsLeap ? 366 : 365;
        int daysInYear2 = year2IsLeap ? 366 : 365;
        
        int totalDays = daysInYear1 + daysInYear2;
        
        System.out.println("Year " + year1 + " has " + daysInYear1 + " days (Leap: " + year1IsLeap + ")");
        System.out.println("Year " + year2 + " has " + daysInYear2 + " days (Leap: " + year2IsLeap + ")");
        
        return totalDays;
    }
    
    public static void main(String[] args) {
        // Example: 2024 is a leap year, 2025 is not
        int year1 = 2024;
        int year2 = 2025;
        
        int totalDays = daysBetweenConsecutiveYears(year1, year2);
        System.out.println("Total days between " + year1 + " and " + year2 + ": " + totalDays);
        
        System.out.println("\n--- Another example ---");
        
        // Example: 2023 is not a leap year, 2024 is
        totalDays = daysBetweenConsecutiveYears(2023, 2024);
        System.out.println("Total days between 2023 and 2024: " + totalDays);

    }
}


