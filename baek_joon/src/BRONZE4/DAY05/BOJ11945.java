package BRONZE4.DAY05;

import java.util.Scanner;

public class BOJ11945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m > 0) {
            for (int i = 0; i < n; i++) {
                char[] text = sc.next().toCharArray();
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(text[j]);
                }
                System.out.println();
            }
        }
    }
}
