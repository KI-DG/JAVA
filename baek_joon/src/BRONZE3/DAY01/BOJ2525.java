package BRONZE3.DAY01;

import java.util.Scanner;

public class BOJ2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a += (b + c) / 60;
        b = (b + c) % 60;

        a %= 24;

        System.out.println(a + " " + b);
    }
}
