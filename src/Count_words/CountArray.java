package Count_words;

import java.util.Scanner;

public class CountArray {
    public static int countWords(String w, char c) {

        if (w == null || w.isEmpty()) {
            System.out.println("Chuỗi trống hoặc null!");
            return 0;
        }

        int count = 0;

        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = "abcdefghaijkalmn";


        while (true) {
            System.out.print("Nhập ký tự cần kiểm tra: ");
            char c = sc.next().charAt(0);


            int result = countWords(input, c);
            System.out.println("Số lần xuất hiện của ký tự '" + c + "': " + result);
        }
    }
}
