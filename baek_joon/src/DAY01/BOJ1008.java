package DAY01;

import java.util.Scanner;

public class BOJ1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextInt();
        double B = sc.nextInt();

        System.out.println(A / B);
    }
}
// double과 float 정밀도가 다르다
// float => 소수점 6~7, double => 소수점 15~16 정도까지 표현가능
// 코딩테스트에서는 double로 쓰는게 더 낫다