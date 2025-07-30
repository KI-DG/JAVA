package BRONZE3.DAY02;

import java.util.Scanner;

public class BOJ4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0){
                break;
            }

            int a2 = a * a;
            int b2 = b * b;
            int c2 = c * c;
            if (a2 + b2 == c2 || b2 + c2 == a2 || a2 + c2 == b2){
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
