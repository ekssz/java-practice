/* Скласти пакет Pr_7_2 у середовищі NetBeans для
обчислення значень функції f ( x ) = x + 3,2x - 5^~xsin 2x на відрізку
[-1; 3] з кроком 0.2. Використати оператор do-while. Забезпечити
консольне виведення результатів. */

package practice;

import static java.lang.Math.*;

public class Pr_7_2 {
    public static void main(String[] args) {
        double k = -1;

        do {
            System.out.println("k = " + k + "\tf = " + (k + 3.2 * k - 5 * pow(k, sin(2 * k))));
            k = round((k + 0.2) * 10) / 10.0;
        } while (k <= 3);
    }
}
