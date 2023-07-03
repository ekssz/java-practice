package practice;

public class Pr_9_3 {
    public static void main(String[] args) {
        String s = "www.mysite.ua";

        // Перевіряємо, чи закінчується рядок суфіксом "ua"
        boolean isUaDomain = s.endsWith(".ua");
        System.out.println(isUaDomain); // Виведе true

        // Перевіряємо, чи закінчується рядок суфіксом "ru"
        boolean isRuDomain = s.endsWith(".ru");
        System.out.println(isRuDomain); // Виведе false
    }
}
