package BRONZE4.DAY04;

import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 4; i++) {
            count += sc.nextInt();
        }

        int min = count /60;
        int sec = count % 60;

        System.out.println(min);
        System.out.println(sec);
    }
}
