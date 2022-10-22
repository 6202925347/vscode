import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class As3_q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int row = sc.nextInt();
        for (int i = row; i >= 0; i--) {
            for (int j = i; j <= row; j++) {
                String c = ("*");
            }

        }
        for (int i = 0; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                String d = ("*");
            }
        }
        System.out.println(c + d);
    }
}
