package Sum_colum;

import java.util.Scanner;

public class Colums {
        public static void main(String[] args) {
            // Bước 2: Thu thập mảng từ người dùng
            Scanner scanner = new Scanner(System.in);

            // Hỏi người dùng về kích thước của mảng
            System.out.print("Nhập số dòng của mảng: ");
            int rows = scanner.nextInt();
            System.out.print("Nhập số cột của mảng: ");
            int cols = scanner.nextInt();

            // Tạo một mảng 2 chiều rỗng
            int[][] userArray = new int[rows][cols];

            // Thu thập từng phần tử của mảng từ người dùng
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Nhập giá trị cho phần tử ở dòng " + (i + 1) + ", cột " + (j + 1) + ": ");
                    userArray[i][j] = scanner.nextInt();
                }
            }

            // Hiển thị mảng đã nhập
            System.out.println("Mảng bạn vừa nhập:");
            for (int[] row : userArray) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }

            // Hỏi người dùng muốn tính tổng của cột nào
            System.out.print("Bạn muốn tính tổng của cột nào? (Nhập cột từ 0 đến " + (cols - 1) + "): ");
            int col = scanner.nextInt();

            // Kiểm tra xem người dùng nhập cột hợp lệ không
            if (col < 0 || col >= cols) {
                System.out.println("Cột không hợp lệ!");
            } else {
                // Tính tổng cột
                int total = 0;
                for (int i = 0; i < rows; i++) {
                    total += userArray[i][col];
                }

                // In ra tổng cột
                System.out.println("Tổng của cột " + col + " là: " + total);
            }
        }
}
