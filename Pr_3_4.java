package practice;

import static java.lang.Math.*;
import java.util.Date;

public class Pr_3_4 {
    public static void main(String[] args) {
        double x = -0.2;
        double y;
        y = (3 * pow(sin(x), 5) - PI * exp(x)) / (2 + sqrt(abs(x) + 1));
        System.out.println("y = " + y);
        
        String name = "Valentine Kliuka";
        Date currentDate = new Date();
        System.out.println(name);
        System.out.println("Current date: " + currentDate);
    }
}
