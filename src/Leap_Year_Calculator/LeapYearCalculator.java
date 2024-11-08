package Leap_Year_Calculator;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter the year: ");
        year = sc.nextInt();

        boolean isLeapYear = false;
        if (year % 4 == 0 ) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a leap Year", year);
        } else {
            System.out.printf("%d not a Leap Year", year);
        }
    }
}
