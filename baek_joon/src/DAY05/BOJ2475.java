package DAY05;

import java.util.Scanner;

public class BOJ2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numSum = 0;
        for (int i = 0; i < 5; i++) {
            int a = sc.nextInt();
            numSum += a * a;
        }
        System.out.println(numSum % 10);
    }
}
