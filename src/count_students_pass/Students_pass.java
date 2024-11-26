package count_students_pass;

import java.util.Scanner;

public class Students_pass {
    public static void InputArray(int[] arr) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("nhap kich thuoc mang: ");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("kich thuoc mang nho hon 30");
            }
        } while (size > 30);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhap phan tu mang " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
    }
    public static int Count_Student(int[] arr) {
        int count = 0;
        System.out.println("Danh sach mang: ");
        InputArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        InputArray(arr);
        int dem = Count_Student(arr);
        System.out.println(dem);
    }

}
