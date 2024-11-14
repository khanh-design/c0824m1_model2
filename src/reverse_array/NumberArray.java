package reverse_array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap kich thuoc cua mang: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Kich thuoc cua mang khong qua 20");
            }
        }while (size > 20);
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.println("Nhap phan tu cua mang " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "phan tu trong mang: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        //Tim gia tri lon nhat.
        int max = arr[0];
        int index = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                index = j;
            }
        }
        System.out.println("\n" +"Gia tri lon nhat trong mang la: " + max + ". Voi vi tri: " + index);
    }
}
