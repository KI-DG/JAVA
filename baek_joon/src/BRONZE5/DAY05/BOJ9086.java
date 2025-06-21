package BRONZE5.DAY05;

import java.util.Scanner;

public class BOJ9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            String answerOne = word.substring(0,1);
            String answerTwo = word.substring(word.length() - 1);
            System.out.println(answerOne + answerTwo);
        }
    }
}
