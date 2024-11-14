package reverse_array;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Chirstian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap 1 ten sinh vien: ");
        String input_name = sc.nextLine();

        //Duyet mang:
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("vi tri cua hoc sinh trong mang: " + students[i]);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Khong tim thay " + input_name + " trong danh sach");
        }
    }
}
