package week1;

import java.io.IOException;
import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int inter = 0;
        int gremio = 0;
        int grenais = 0;
        int type = 1;
        while (type == 1) {
            grenais++;
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println("Novo grenal (1-sim 2-nao)");
            type = scan.nextInt();
            if (n > m) inter++;
            if (n < m) gremio++;
        }
        System.out.printf("%d grenais\n", grenais);
        System.out.printf("Inter:%d\n", inter);
        System.out.printf("Gremio:%d\n", gremio);
        System.out.printf("Empates:%d\n", grenais - inter - gremio);
        if (inter == gremio) {
            System.out.println("Não houve vencedor");
        } else if (inter > gremio) {
            System.out.println("Inter venceu mais");
        } else {
            System.out.println("Gremio venceu mais");
        }
    }
}
