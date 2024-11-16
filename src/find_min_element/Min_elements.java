package find_min_element;

public class Min_elements {
    public static int min_Value(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return arr[index];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int index = min_Value(arr);
        System.out.println("Ta co gia tri nho nhat trong mang: " + index);
    }
}
