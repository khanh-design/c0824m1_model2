package Delete_Element_Array;


public class Delete_Array {
    public static void Delete_element(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return;
        }

        // Di chuyen cac phan tu sau inde xlen 1 don vi
        for (int i  = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Gan phan tu cuoi cung trong index
        arr[arr.length - 1] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int index = 3;
        System.out.println("Mang ban dau: " + arr);
        printArray(arr);
        Delete_element(arr, index);
        System.out.println("Mang sau khi xoa: " + arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
