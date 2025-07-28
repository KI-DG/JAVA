package BRONZE3.DAY01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();

        int a = sc.nextInt();
        arr.add(a);

        for (int i = 0; i < 8; i++) {
            int b = sc.nextInt();
            arr.add(b);
            a = Math.max(a, b);
        }
        System.out.println(a);
        System.out.println(arr.indexOf(a) + 1);
    }
}
