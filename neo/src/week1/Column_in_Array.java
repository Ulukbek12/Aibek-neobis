package week1;

import java.io.IOException;
import java.util.Scanner;

public class Column_in_Array {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = (scan.nextInt() + 1) % 12;
        char type = scan.next().charAt(0);
        double sum = 0;
        for (int i = 1; i <= 144; i++) {
            double number = scan.nextDouble();
            if (i % 12 == n) sum += number;
        }
        if (type == 'S') {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", sum / 12.0);
        }
    }
}
