package convert_temperature;

import java.util.Scanner;

public class Temperature {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Celsius");
            System.out.println("2. Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Celsius");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Fahrenheit: ");
                    celsius = sc.nextDouble();
                    System.out.println("Celsius: " + celsiusToFahrenheit(celsius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while(choice != 0);
    }
}
