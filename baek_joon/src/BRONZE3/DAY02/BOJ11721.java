package BRONZE3.DAY02;

import java.util.Scanner;

public class BOJ11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        for (int i = 0; i < a.length(); i = i + 10) {
            String temp;
            // 10개씩 자르는 경우
            if (i + 10 < a.length()) {
                temp = a.substring(i, i+ 10);
            } else {
                temp = a.substring(i);
            }
            System.out.println(temp);
        }
    }
}
