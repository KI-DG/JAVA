package BRONZE4.DAY03;

import java.util.Scanner;

public class BOJ10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c > 180) {
            System.out.println("Error");
        } else if (a + b + c == 180) {
            if (a == 60 && b == 60) {
                System.out.println("Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
