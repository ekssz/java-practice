package practice;

//-*- coding: utf-8 -*-
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pr_4_2 {
 public static void main(String[] args) {
     // Оголошення і створення об’єкта для сканування клавіатури
     Scanner scan = new Scanner(System.in);
     int n;
     System.out.println("vvedit tsile shislo: ");
     n = scan.nextInt();
     System.out.println("shislo " + 2 * n + " y 2 raza bilshe vashogo.");
     double x;
     System.out.println("vvedit drobove chislo: ");
     x = scan.nextDouble();
     System.out.println("chislo " + x / 3 + " y 3 menshe vashogo.");
     String s;
     System.out.println("vvedit vashe imya: ");
     s = scan.next();
     System.out.println("dyje priemno, " + s);

     // Отримуємо поточну дату та час
     Date currentDate = new Date();
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

     // Виводимо на екран поточну дату та час
     System.out.println("current date: " + dateFormat.format(currentDate));
 }
}
