package BRONZE4.DAY04;

import java.util.Scanner;

public class BOJ5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minSum = 0;
        int manSum = 0;

        for (int i = 0; i < 4; i++) {
            minSum += sc.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            manSum += sc.nextInt();
        }
        System.out.println(Math.max(minSum, manSum));
    }
}
