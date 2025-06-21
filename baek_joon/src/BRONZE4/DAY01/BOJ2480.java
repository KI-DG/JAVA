package BRONZE4.DAY01;

import java.util.Scanner;

public class BOJ2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int count = 0;

        if (a == b && b == c) {
            count = 10000 + a * 1000;
        } else if (a == b || a == c) {
            count = 1000 + a * 100;
        } else if (b == c) {
            count = 1000 + b * 100;
        } else{
            count = Math.max(a, Math.max(b, c)) * 100;
        }
        System.out.println(count);
    }
}
