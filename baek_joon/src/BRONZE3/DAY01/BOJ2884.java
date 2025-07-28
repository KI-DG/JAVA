package BRONZE3.DAY01;

import java.util.Scanner;

public class BOJ2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        if (H != 0 && M < 45) {
            H = H - 1;
            M = M + 15;
        } else if (H == 0 && M < 45) {
            H = H + 23;
            M = M + 15;
        } else if (M >= 45){
            M = M - 45;
        }
        // GPT 추천 코드
        //        M -= 45;
        //        if (M < 0) {
        //            M += 60;
        //            H -= 1;
        //        }
        //        if (H < 0) {
        //            H = 23;
        //        }


        System.out.println(H + " " +  M);
    }
}
