package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pr_4_1 {
    public static void main(String[] args) {
        // Оголошуємо і одразу ініціалізуємо координати вершин прямокутника
        double x1 = 2.3;
        double x2 = 5.2;
        double y1 = 1.0;
        double y2 = 3.5;
        double xm, ym;

        // Ініціалізуємо випадкові координати точки у межах прямокутника
        xm = x1 + (x2 - x1) * Math.random();
        ym = y1 + (y2 - y1) * Math.random();

        // Отримуємо поточну дату та ім'я
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String name = "Valentin Kliuka";

        // Виводимо на екран координати точки М, ім'я та поточну дату
        System.out.println("M(" + xm + "; " + ym + ")");
        System.out.println(name);
        System.out.println("current date: " + dateFormat.format(currentDate));
    }
}
