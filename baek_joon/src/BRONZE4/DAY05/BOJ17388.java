package BRONZE4.DAY05;

import java.util.Scanner;

public class BOJ17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();
        int K = sc.nextInt();
        int H = sc.nextInt();

        int uniSum = S + K + H;

        if (uniSum >= 100) {
            System.out.println("OK");
        } else {
            if (Math.min(S, Math.min(K, H)) == S) {
                System.out.println("Soongsil");
            } else if (Math.min(S, Math.min(K, H)) == K) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}
