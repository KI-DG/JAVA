package BRONZE5.DAY06;

import java.util.Scanner;

public class BOJ4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }
            if (a <= b) {
                System.out.println("No");
            } else if (a > b) {
                System.out.println("Yes");
            }
        }
    }
}
