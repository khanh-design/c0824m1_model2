import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Hello: " + name);
    }
}