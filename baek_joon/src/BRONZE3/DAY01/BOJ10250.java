package BRONZE3.DAY01;

import java.util.Scanner;

public class BOJ10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int room;
            int floor;

            if (N % H == 0){
                floor = H;
                room = N / H;
            } else {
                room = N / H + 1;
                floor = N % H;
            }
            if (room < 10) {
                System.out.println(floor + "0" + room);
            } else {
                System.out.println(floor + "" + room);
            }
        }
    }
}
