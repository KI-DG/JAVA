package BRONZE4.DAY01;

import java.util.Scanner;

public class BOJ10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count[ch - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
