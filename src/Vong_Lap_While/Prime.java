package Vong_Lap_While;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println(number + " khong la so nguyen to");
        } else {
            boolean check = true;
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " la so nguyen to");
            } else {
                System.out.println(number + " khong la so nguyen to");
            }
        }
    }
}
