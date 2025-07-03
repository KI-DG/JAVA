package BRONZE4.DAY04;

import java.util.Scanner;

public class BOJ11943 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int appleA = sc.nextInt();
        int orangeA = sc.nextInt();
        int appleB = sc.nextInt();
        int orangeB = sc.nextInt();


        int answerOne = appleA + orangeB;
        int answerTwo = orangeA + appleB;
        int answer = Math.min(answerTwo, answerOne);
        System.out.println(answer);
    }
}
