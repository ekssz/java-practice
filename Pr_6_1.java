/* В права 1. Скласти пакет Pr_6_1 у середовищі NetBeans для
обчислення факторіалу числа n! Виконайте цю програму перший
раз з коментарями, а другий раз - знявши їх, щоб випробувати
використання мітки M_.
Зауваж ення. М ітка М _ - це назва блоку (M_:{}), з якого ми
виходимо, коли читаємо оператор break. */


package practice;

import java.util.*;

public class Pr_6_1 {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("vvedit tsile dodatne chislo: ");
        n = scan.nextInt();
        int s = 1;

        M_: {
            if (n < 0) {
                break M_;
            }
            else {
                if (n == 0) {
                    ;
                }
                else {
                    for (int k = 1; k <= n; k++) {
                        s *= k;
                    }
                }
            }
            System.out.println(n + "! = " + s);
        }

        System.out.println("chislo maye buti >= 0");
    }
}
