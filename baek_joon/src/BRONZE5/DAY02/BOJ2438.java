package BRONZE5.DAY02;

import java.util.Scanner;

public class BOJ2438 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("*".repeat(i));
            // rapeat == java 11이상에서만 가능
            // 11이전에는 이중 for문을 이용해서 작성
            //for (int i = 1; i <= N; i++) {
            //            String line = "";
            //            for (int j = 0; j < i; j++) {
            //                line += "*"; // 문자열에 별 누적
            //            }
            //            System.out.println(line);
            //        }
        }

    }
}
