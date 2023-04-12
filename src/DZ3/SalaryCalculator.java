package DZ3;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the cost of the hour: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter the tax percentage: ");
        double taxPercentage = scanner.nextDouble();

        int workingDays = getWorkingDaysOfMonth(month);
        double monthlySalary = workingDays * 8 * hourlyRate;
        double taxAmount = monthlySalary * (taxPercentage / 100);
        double monthlySalaryWithoutTax = monthlySalary - taxAmount;

        System.out.printf("Monthly salary with tax: %.2f\n", monthlySalary);
        System.out.printf("Monthly salary without tax: %.2f", monthlySalaryWithoutTax);
    }

    private static int getWorkingDaysOfMonth(int month) {
        int daysInMonth = getDaysInMonth(month);
        int firstDayOfWeek = getFirstDayOfWeek(month);
        int workingDays = 0;

        for (int i = 1; i <= daysInMonth; i++) {
            int dayOfWeek = (firstDayOfWeek + i - 1) % 7;
            if (dayOfWeek >= 1 && dayOfWeek <= 5) {
                workingDays++;
            }
        }

        return workingDays;
    }

    private static int getDaysInMonth(int month) {
        if (month == 2) {
            return 28; // assume non-leap year
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    private static int getFirstDayOfWeek(int month) {
        // January 1, 1900 was a Monday
        int daysSinceMonday = getTotalDaysSince1900(month, 1) % 7;
        return (daysSinceMonday + 1) % 7;
    }

    private static int getTotalDaysSince1900(int month, int day) {
        int totalDays = 0;

        // count days in previous years
        for (int year = 1900; year < 2023; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        // count days in previous months
        for (int i = 1; i < month; i++) {
            totalDays += getDaysInMonth(i);
        }

        // count days in current month
        totalDays += day - 1;

        return totalDays;
    }
}