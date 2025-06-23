package BRONZE4.DAY01;

import java.util.Scanner;

public class BOJ5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int count = 0;
        for (int i = 0; i < 9; i++) {
            int book = sc.nextInt();
            count += book;
        }
        System.out.println(total - count);
    }
}
