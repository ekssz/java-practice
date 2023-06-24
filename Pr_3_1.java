package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pr_3_1 {
    public static void main(String[] args) {
        int x;
        double y;
        x = 5;
        y = x + 2.5;
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        
        // Виведення імені
        String name = "Valentine Kliuka"; // Замініть це на ваше ім'я
        System.out.println(name);
        
        // Виведення поточної дати та часу
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("current date: " + formattedDateTime);
    }
}