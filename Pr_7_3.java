package practice;

public class Pr_7_3{
    static double f(double x) {
        return x*x*x - 3*x*x + 3;
    }

    public static void main(String[] args) {
        double a = 0.0, b = 1.5, c, y, eps = 1e-8;
        
        do {
            c = 0.5 * (a + b);
            y = f(c);

            if (Math.abs(y) < eps) {
                break; // Корінь знайдено. Виходимо із циклу
            }

            // Якщо на кінцях відрізка [а; c] функція має різні знаки:
            if (f(a) * y < 0.0) {
                b = c; // Отже, корінь тут. Переносимо точку b у точку c
            } else {
                a = c; // В іншому випадку: Переносимо точку а в точку с
            }

            // Продовжуємо, доки відрізок [а; b] не стане малим
        } while (Math.abs(b - a) >= eps);

        System.out.println("x = " + c + ", f(" + c + ") = " + y);
    }
}
