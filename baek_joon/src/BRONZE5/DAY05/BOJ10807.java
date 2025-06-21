package BRONZE5.DAY05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            nums.add(a);
        }
        int num = sc.nextInt();
        for (int b : nums) {
            if (b == num) {
                count++;
            }
        }
        System.out.println(count);
    }
}
