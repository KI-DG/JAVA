package BRONZE4.DAY04;

import java.util.Scanner;

public class BOJ1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String text = sc.nextLine();
            if (text.equals("#")) {
                break;
            }
            char[] textArr = text.toCharArray();
            int count = 0;
            for (int i = 0; i < textArr.length; i++) {
                if (textArr[i] == 'A'||textArr[i] == 'E'||textArr[i] == 'O'||textArr[i] == 'U'||textArr[i] == 'I'||textArr[i] == 'a'||textArr[i] == 'e'||textArr[i] == 'o'||textArr[i] == 'u'||textArr[i] == 'i') {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
