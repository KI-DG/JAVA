package BRONZE4.DAY04;

import java.util.Scanner;

public class BOJ5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int A = sc.nextInt();  // 국어 풀어야 문제
        int B = sc.nextInt();  // 수학 풀어야 문제
        int C = sc.nextInt();  // 하루에 국어를 풀 수 있는 문제
        int D = sc.nextInt();  // 하루에 수학을 풀 수 있는 문제

        int count = A / C;
        if (A % C != 0) {
            count += 1;
        }
        int mathCount = B / D;
        if (B % D != 0){
            mathCount += 1;
        }
        int answer = L - Math.max(count, mathCount);

        System.out.println(answer);
    }
}
