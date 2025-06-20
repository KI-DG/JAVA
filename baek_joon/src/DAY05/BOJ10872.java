package DAY05;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
        } else {
            int answer = 1;
            for (int i = 1; i <= n; i++) {
                answer *= i;
            }
            System.out.println(answer);
        }
    }
}
