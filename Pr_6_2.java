package practice;

import static java.lang.Math.*;

public class Pr_6_2 {
    public static void main(String[] args) {
        double x;
        for (x = -1.0; x <= 3.0; x = x + 0.2) {
            System.out.println("x=" + x + '\t' + "f=" + (pow(x, 3) + 3.2 * pow(x, 2) - 2 * x));
        }
    }
}
