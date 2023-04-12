package DZ2;

import java .util.Scanner;

public class HourlyWageCalculator { public static void main(String[] args) { Scanner scanner = new Scanner(System.in);

    // Ask user for input
    System.out.println("Please enter the number of work hours per week:");
    int workHours = scanner.nextInt();
    System.out.println("Please enter the annual salary including taxes:");
    int salary = scanner.nextInt();
    System.out.println("Please enter the tax rate:");
    double taxRate = scanner.nextDouble();

    // Calculate hourly wage
    int weeksPerYear = 52;
    int monthsPerYear = 12;
    int weeksPerMonth = 4;
    double totalHours = workHours * (weeksPerYear / monthsPerYear) * weeksPerMonth;
    double taxedSalary = salary - (salary * (taxRate / 100));
    double hourlyWage = taxedSalary / totalHours;

    // Output the result
    System.out.println("With " + workHours + " hours of work per week and an annual salary of " + salary + " with a tax rate of " + taxRate + "% the hourly wage without tax is " + hourlyWage + ".");
}

}
