package week1;

import java.io.IOException;
import java.util.Scanner;

public class Game_Time_with_Minutes {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int start_hour = scan.nextInt();
        int start_minute = scan.nextInt();
        int end_hour = scan.nextInt();
        int end_minute = scan.nextInt();

        int start = start_hour * 60 + start_minute;
        int end = end_hour * 60 + end_minute;

        if (end <= start) {
            end += 24 * 60;
        }
        int duration = end - start;

        print(duration / 60, duration % 60);
    }

    public static void print(int hours, int minutes) {
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", hours, minutes);
    }
}
