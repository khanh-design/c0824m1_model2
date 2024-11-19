package Merege_Array;

import java.util.Arrays;

public class merege_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {7, 8, 9, 10};

        int length = arr1.length + arr2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : arr1) {
            result[pos] = element;
            pos++;
        }

        for (int element : arr2) {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
    }
}
