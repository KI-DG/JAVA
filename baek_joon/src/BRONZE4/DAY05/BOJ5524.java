package BRONZE4.DAY05;

import java.util.Locale;
import java.util.Scanner;

public class BOJ5524 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();

            System.out.println(name.toLowerCase(Locale.ROOT));
        }
    }
}
