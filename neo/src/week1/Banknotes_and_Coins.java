package week1;

import java.util.Scanner;

public class Banknotes_and_Coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] banknote = {100, 50, 20, 10, 5, 2};
        double[] coin = {1, 0.5, 0.25, 0.10, 0.05, 0.01};
        double money = scan.nextDouble();
        int Money = (int) (money * 100);
        System.out.println("NOTAS:");
        for (int notas : banknote) {
            int Notas = notas * 100;
            int amount = Money / Notas;
            Money -= amount * Notas;
            print(amount, "nota", notas);
        }
        System.out.println("MOEDAS:");
        for (double moedas : coin) {
            int Moedas = (int) (moedas * 100);
            int amount = Money / Moedas;
            Money -= amount * Moedas;
            print(amount, "moeda", moedas);
        }
    }

    public static void print(int a, String type, double b) {
        System.out.printf("%d %s(s) de R$ %.2f\n", a, type, b);
    }
}
