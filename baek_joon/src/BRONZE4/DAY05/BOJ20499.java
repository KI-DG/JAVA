package BRONZE4.DAY05;

import java.util.Scanner;

public class BOJ20499 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("/");

        int K = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int A = Integer.parseInt(input[2]);

        if (K + A < D || D == 0) {
            System.out.println("hasu");
        } else {
            System.out.println("gosu");
        }
    }
}
