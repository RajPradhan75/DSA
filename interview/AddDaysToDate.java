package datastructures.src.com.interview;

public class AddDaysToDate {

    public static void main(String[] args) {
//        System.out.println(addDaysToDate(1,1,2022,31));
//        int day = 1;
//        int month = 1;
//        int year = 2022;
//        int daysToadd = 70;
//
//        System.out.println(addDaysToDate(day, month, year, daysToadd));

        int[] result2 = addDaysToDate(1, 1, 2022, 70);
        System.out.println(" Output Date: " + formatDate(result2));
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) ||
                (year % 400 == 0);
    }

    public static int[] addDaysToDate(int day, int month, int year, int daysToAdd) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Days in each month

        // Leap year check
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        if (isLeapYear) {
            daysInMonth[2] = 29; // February has 29 days in a leap year
        }

        // Calculate new date
        day += daysToAdd;
        while (day > daysInMonth[month]) {
            day -= daysInMonth[month];
            month++;
            if (month > 12) {
                month = 1;
                year++;
                isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                daysInMonth[2] = isLeapYear ? 29 : 28;
            }
        }

        return new int[]{day, month, year};
    }

    public static String formatDate(int[] date) {
        return String.format("%02d-%02d-%04d", date[0], date[1], date[2]);
    }


}
