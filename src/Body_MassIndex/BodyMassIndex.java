package Body_MassIndex;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter the weight in pounds: ");
        weight = sc.nextDouble();

        System.out.print("Enter the height in inches: ");
        height = sc.nextDouble();

        bmi = (weight / Math.pow(height, 2));
        System.out.printf("%-20s%s", "bmi", "interpretation\n");

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Normal");
        } else if (bmi >= 25.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
