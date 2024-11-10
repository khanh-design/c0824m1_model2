package Vong_Lap_While;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = sc.nextInt();
        System.out.print("Enter the second number: ");
        b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("The two numbers are equal");
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        System.out.println("Uoc chung lon nhat la: " + a);    }
}
