package BRONZE4.DAY02;

import java.util.Scanner;

public class BOJ10797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt();
            if (number == n) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
