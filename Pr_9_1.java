package practice;

import java.util.Scanner;

public class Pr_9_1 {
    static Scanner text = new Scanner(System.in);
    
    public static void main(String[] args) {
        String b, c;
        System.out.println("vvedit text:");
        b = text.nextLine();
        c = b.replace(' ', '.');
        System.out.println(c);
    }
}
