package BRONZE4.DAY01;

import java.util.Scanner;

public class BOJ5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int upBurger = sc.nextInt();
        int middleBurger = sc.nextInt();
        int downBurger = sc.nextInt();

        int coke = sc.nextInt();
        int cider = sc.nextInt();

        int burger = Math.min(upBurger, Math.min(middleBurger, downBurger));
        int drink = Math.min(coke, cider);

        int sum = burger + drink - 50;

        System.out.println(sum);

    }
}
