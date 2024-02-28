package week1;

import java.io.IOException;
import java.util.Scanner;

public class Logical_Sequence_2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int columns = 0, start = 1;
        while (start <= m) {
            System.out.print(start++);
            columns = (columns + 1) % n;
            if (columns == 0 && start != m) System.out.println();
            else System.out.print(" ");
        }
    }
}