package BRONZE5.DAY02;

import java.util.Scanner;

public class BOJ1330 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A < B) {
            System.out.println('<');
        } else if(A > B) {
            System.out.println('>');
        } else{
            System.out.println("==");
        }

    }
}
// '' 의 차이는 "" char와 String을 구분 그래서 " " 로 써줘야됨