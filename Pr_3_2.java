package practice;

import java.time.LocalDate;

public class Pr_3_2 {
    public static void main(String[] args) {
        byte b1 = 50, b2 = -99;
        short det = 0, ind = 1;
        int i = -100, j = 100, k = 9999, k1, k2;
        long big = 50, veryBig = 2147483648L;
        char c1 = 'A', c2 = '?', newLine = '\n';
        short b3 = (short) (b1 + b2);
        j = (--j);
        k1 = (k++) + 5;
        k2 = (--k) + 5;
        char c = (char) (c2 + c1 + newLine);

        String name = "Valentine Kliuka";
        LocalDate currentDate = LocalDate.now();

        System.out.println("c=" + c);
        System.out.println("c3=" + c2 + c1 + newLine);
        System.out.println("b3=" + b3);
        System.out.println("j=" + j);
        System.out.println("k1=" + k1);
        System.out.println("k2=" + k2);
        System.out.println(name);
        System.out.println("Current Date: " + currentDate);
    }
}
