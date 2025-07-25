package BRONZE4.DAY05;

import java.util.Scanner;

public class BOJ2083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String name = sc.next();
            int old = sc.nextInt();
            int weight = sc.nextInt();

            if (name.equals("#")) {
                break;
            }
            if (old > 17 || weight >= 80) {
                System.out.println(name + " Senior");
            } else {
                System.out.println(name + " Junior");
            }
        }
    }
}
