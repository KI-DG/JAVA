package BRONZE5.DAY06;

import java.util.Scanner;

public class BOJ27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int n = sc.nextInt();

        System.out.println(word.substring(n - 1, n));

    }
}
