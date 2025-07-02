package BRONZE4.DAY03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int P = sc.nextInt();

        int people = L * P;
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int partyPeople = sc.nextInt();
            answer.add(partyPeople - people);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
}
