package BRONZE3.DAY01;

import java.util.Scanner;

public class BOJ10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int minNum = Integer.MAX_VALUE;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();

            minNum = Math.min(a, minNum);
            maxNum = Math.max(a, maxNum);
        }
        //        int n = sc.nextInt();
        //        int min = sc.nextInt();
        //        int max = min;
        //
        //        for (int i = 1; i < n; i++) {
        //            int num = sc.nextInt();
        //            min = Math.min(min, num);
        //            max = Math.max(max, num);
        //        }
        System.out.println(minNum + " " + maxNum);
    }
}
