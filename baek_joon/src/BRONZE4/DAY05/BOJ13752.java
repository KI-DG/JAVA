package BRONZE4.DAY05;

import java.util.Scanner;

public class BOJ13752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();

            for (int k = 0; k < j; k++) {
                System.out.print("=");
            }
        System.out.println();
        }
    }
}
