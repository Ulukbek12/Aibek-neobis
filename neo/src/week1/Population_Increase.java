package week1;

import java.io.IOException;
import java.util.Scanner;

public class Population_Increase {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i = 1; i <= t; i++) {
            int pa = scan.nextInt(), pb = scan.nextInt();
            double g1 = scan.nextDouble(), g2 = scan.nextDouble();
            int years = 0;
            boolean flag = true;
            while (years < 100) {
                years++;
                int add_a = (int) (pa * (g1 / 100.0));
                int add_b = (int) (pb * (g2 / 100.0));
                pa += add_a;
                pb += add_b;
                if (pa > pb) {
                    System.out.printf("%d anos.\n", years);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Mais de 1 seculo.");
            }
        }
    }
}
