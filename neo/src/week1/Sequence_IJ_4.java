package week1;

import java.io.IOException;

public class Sequence_IJ_4 {
    public static void main(String[] args) throws IOException {
        int si = 0, sj = 10;
        while (si <= 20) {
            if (si % 10 == 0) {
                System.out.printf("I=%.0f J=%.0f\n", si / 10.0, sj / 10.0);
                System.out.printf("I=%.0f J=%.0f\n", si / 10.0, (sj + 10) / 10.0);
                System.out.printf("I=%.0f J=%.0f\n", si / 10.0, (sj + 20) / 10.0);
            } else {
                System.out.printf("I=%.1f J=%.1f\n", si / 10.0, sj / 10.0);
                System.out.printf("I=%.1f J=%.1f\n", si / 10.0, (sj + 10) / 10.0);
                System.out.printf("I=%.1f J=%.1f\n", si / 10.0, (sj + 20) / 10.0);
            }
            si += 2;
            sj += 2;
        }
    }
}
