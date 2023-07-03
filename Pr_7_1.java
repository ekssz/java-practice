package practice;


import static java.lang.Math.*;

public class Pr_7_1 {
    public static void main(String[] args) {
        double a = 10; 
        double k = -1;
        while (k <= 3) {
            System.out.println("k = " + k + "\tf = " + (pow(k, 3) + 3.2 * pow(k, 2) -
                    5 * a / k * sin(2 * k)));
            k = (int) ((k + 0.2) * 10) / 10.0;
        }
    }
}
