package DZ3;

import java.util.Scanner;

public class ProductCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of the product per unit: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the quantity of the product you want to purchase: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        if (quantity > 10) {
            total *= 0.95; // apply 5% discount
        }

        if (quantity > 20) {
            total *= 0.9; // apply 10% discount
        }

        if (quantity > 30) {
            int additionalUnits = quantity - 30;
            double discount = 0.12 + (additionalUnits / 10.0) * 0.004; // calculate discount based on additional units
            total *= (1 - discount);
        }

        if (quantity > 80) {
            total *= 0.87; // apply 13% discount
        }

        System.out.printf("The total cost of %d units of the product is %.2f", quantity, total);
    }
}