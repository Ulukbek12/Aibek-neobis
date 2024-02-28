package week1;

import java.util.Scanner;

public class Triangle_Types {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a < b)  {
            double tmp = a;
            a = b;
            b = tmp;
        }
        if (a < c) {
            double tmp = a;
            a = c;
            c = tmp;
        }
        if (b < c) {
            double tmp = b;
            b = c;
            c = tmp;
        }
        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        }
        if (a * a == b * b + c * c) {
            System.out.println("TRIANGULO RETANGULO");
        }
        if (a * a > b * b + c * c) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        if (a * a < b * b + c * c) {
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if (a == c) {
            System.out.println("TRIANGULO EQUILATERO");
        }
        if (a != c && (a == b || b == c)) {
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
