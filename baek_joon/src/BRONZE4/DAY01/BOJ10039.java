package BRONZE4.DAY01;

import java.util.Scanner;

public class BOJ10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            int score = sc.nextInt();

            if (score < 40) {
                score = 40;
            }
            sum += score;
        }

        System.out.println(sum / 5);
    }
}
