package DAY02;

import java.util.Scanner;

public class BOJ2739 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = 1; i < 10; i++) {
           System.out.println(N + " * " + i + " = " + (N * i));

//           System.out.println(String.format("%d * %d = %d", N, i, N * i));
//         두가지 방법이 있다 포맷을 활용하면 메모리는 적게 시간이 빠르게 나온다
        }
    }
}
