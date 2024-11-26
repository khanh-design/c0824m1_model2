package Search_Max_Value;

import java.util.Scanner;

public class Min_Value {
    public static int Search_Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void InputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap kich thuoc cua mang: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap phan tu " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        InputArray(arr);
        int min = Search_Min(arr);
        System.out.println("Gia tri lon nhat: " + min);
    }
}
