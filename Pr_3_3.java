package practice;

import java.time.LocalDate;

public class Pr_3_3 {
    public static void main(String[] args) {
        double x = -0.2;
        double y;
        y = (3 * Math.pow(Math.sin(x), 5) -
                Math.PI * Math.exp(x)) / (2 + Math.sqrt(Math.abs(x) + 1));
        System.out.println("y=" + y);

        String name = "Valentine Kliuka";
        LocalDate currentDate = LocalDate.now();

        System.out.println(name);
        System.out.println("Current Date: " + currentDate);
    }
}
