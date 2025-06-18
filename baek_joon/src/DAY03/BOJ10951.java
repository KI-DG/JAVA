package DAY03;

import java.util.Scanner;

public class BOJ10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // hasNext() True or False로 반환 다음값이 없으면 False
        while(sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a + b);
        }
    }
}
