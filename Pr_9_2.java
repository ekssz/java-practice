package practice;

import java.util.Scanner;

public class Pr_9_2 {
    static Scanner text = new Scanner(System.in, "Cp1251");
    
    public static void main(String[] args) {
        String b, c;
        System.out.println("vvedit text:");
        b = text.nextLine();
        c = b.replace("u", "i");
        System.out.println(c);
    }
}
