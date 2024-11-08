package Exchange_money;

import java.util.Scanner;

public class ExchangeMoney {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap usd muon chuyen: ");
        usd = sc.nextDouble();

        double quydoi = usd * 23000;
        System.out.print("Gia tri VND: " + quydoi);
    }

}
