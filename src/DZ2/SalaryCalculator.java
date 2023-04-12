package DZ2;

public class SalaryCalculator { public static void main(String[] args) { int hoursPerWeek = Integer.parseInt(args[0]);
    double hourlyRate = Double.parseDouble(args[1]); double taxRate = Double.parseDouble(args[2]);

    // Calculate monthly salary
    double monthlySalaryBeforeTaxes = 4 * hoursPerWeek * hourlyRate;
    double monthlySalaryAfterTaxes = monthlySalaryBeforeTaxes - (monthlySalaryBeforeTaxes * taxRate / 100);

    // Calculate yearly salary
    double yearlySalaryBeforeTaxes = 12 * monthlySalaryBeforeTaxes;
    double yearlySalaryAfterTaxes = yearlySalaryBeforeTaxes - (yearlySalaryBeforeTaxes * taxRate / 100);

    // Display results
    System.out.println("Monthly Salary Before Taxes: " + monthlySalaryBeforeTaxes);
    System.out.println("Monthly Salary After Taxes: " + monthlySalaryAfterTaxes);
    System.out.println("Yearly Salary Before Taxes: " + yearlySalaryBeforeTaxes);
    System.out.println("Yearly Salary After Taxes: " + yearlySalaryAfterTaxes);
}

}
