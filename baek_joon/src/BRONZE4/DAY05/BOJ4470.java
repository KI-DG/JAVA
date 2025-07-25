package BRONZE4.DAY05;

import java.util.Scanner;

public class BOJ4470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.nextLine();
        for (int i = 1; i < n + 1; i++) {
            String text = sc.nextLine();

            System.out.println(i + ". " + text);
        }
    }

}
