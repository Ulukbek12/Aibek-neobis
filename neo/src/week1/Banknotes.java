package week1;

import java.util.Locale;
import java.util.Scanner;

public class Banknotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] banknote = {100, 50, 20, 10, 5, 2, 1};
        int money = scan.nextInt();
        System.out.println(money);
        for (int i = 0; i < banknote.length; i++) {
            int amount = money / banknote[i];
            money -= amount * banknote[i];
            print(amount, banknote[i]);
        }
    }

    public static void print(int a, double b) {
        System.out.printf(Locale.ITALY, "%d nota(s) de R$ %.2f\n", a, b);
    }
}
