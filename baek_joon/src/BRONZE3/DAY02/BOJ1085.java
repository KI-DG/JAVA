package BRONZE3.DAY02;

import java.util.Scanner;

public class BOJ1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int xStart = 0;
        int yStart = 0;

        int xMin = Math.min(Math.abs(w - x),Math.abs(xStart - x));
        int yMin = Math.min(Math.abs(h - y),Math.abs(yStart - y));

        System.out.println(Math.min(xMin, yMin));
    }
}
