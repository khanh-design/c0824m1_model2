package Menu;

import java.util.Scanner;

public class menu_rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu rectangle");
        System.out.println("1. Create a rectangle");
        System.out.println("2. Create a square rectangle");
        System.out.println("3. Create isosceles triangle");
        System.out.println("4. Exit");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter rectangle");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Enter a square rectangle");
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Enter isosceles triangle");
                for (int i = 6; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}
