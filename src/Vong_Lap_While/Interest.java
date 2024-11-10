package Vong_Lap_While;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interest = 1.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        money = sc.nextDouble();

        System.out.println("Nhap thang gui: ");
        month = sc.nextInt();

        System.out.println("Nhap lai suat: ");
        interest = sc.nextDouble();

        double total = 0;
        for (int i = 1; i < month; i++) {
            total += money * (interest/100)/12 *month;
        }
        System.out.println("Lai suat la: " + total);
    }
}
