package Add_Element_Array;

public class Add_Array {
        // Hàm để chèn phần tử vào mảng tại một vị trí chỉ định
        public static int[] Add_Arr(int[] arr, int index, int value) {
            // Kiểm tra xem chỉ số có hợp lệ không
            if (index < 0 || index >= arr.length) {
                System.out.println("Không thể chèn phần tử vào mảng!");
                return arr;
            }

            // Tạo mảng mới có kích thước lớn hơn 1 so với mảng ban đầu
            int[] newArr = new int[arr.length + 1];

            // Chèn phần tử vào vị trí chỉ định
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i]; // Sao chép các phần tử trước vị trí chèn
            }

            newArr[index] = value; // Chèn phần tử mới vào vị trí chỉ định

            // Sao chép các phần tử sau vị trí chèn vào mảng mới
            for (int i = index + 1; i < newArr.length; i++) {
                newArr[i] = arr[i - 1];
            }

            return newArr; // Trả về mảng mới sau khi đã chèn
        }

        public static void main(String[] args) {
            int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0};
            int[] newArr = Add_Arr(arr, 3, 99); // Chèn phần tử 99 vào vị trí 3

            // In ra mảng mới sau khi chèn phần tử
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
}
