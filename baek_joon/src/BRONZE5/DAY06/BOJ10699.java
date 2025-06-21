package BRONZE5.DAY06;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class BOJ10699 {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now();
//        System.out.println(today);

        Date today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(today)); // 출력 예: 2025-06-20
    }
}
