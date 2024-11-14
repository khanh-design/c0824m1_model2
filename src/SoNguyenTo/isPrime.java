package SoNguyenTo;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;

        while (count < 20) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number");
                count++;
            }
            number++;
        }
    }
}
