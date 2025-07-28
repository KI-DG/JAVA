package BRONZE3.DAY01;

import java.util.Scanner;

public class BOJ2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int ones = B % 10;
        int tens = (B / 10)% 10;
        int hund = B / 100;
        System.out.println(ones * A);
        System.out.println(tens * A);
        System.out.println(hund * A);
        System.out.println(B * A);

    }
}
