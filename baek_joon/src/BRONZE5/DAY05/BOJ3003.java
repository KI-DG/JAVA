package BRONZE5.DAY05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // chess 말을 담은 리스트 만들기
        List<Integer> chess = new ArrayList<>();
        // Integer로는 한줄을 통으로 받을 수 없기 때문에 String으로 먼저 받아준다
        String line = sc.nextLine();
        // 뛰어쓰기로 String 을 받는 List를 만든다
        String[] tokens = line.split(" ");
        // Stiring 에서 다시 Int 로 변환
        for (String token : tokens) {
            chess.add(Integer.parseInt(token));
        }
        // king 1개, queen 1개, rock 2개, bishop 2개, knight 2개, pawn 8개 List를 만들어준다
        List<Integer> pieces = List.of(1, 1, 2, 2, 2, 8);

        for (int i = 0; i < 6; i++) {
            System.out.print(pieces.get(i) - chess.get(i) + " ");
        }
    }
}
