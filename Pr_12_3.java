package practice;

class Rectangle {
    private double a, b;
    
    Rectangle() {
        a = 1;
        b = 1;
    } 
    
    Rectangle(double x) {
        a = x;
        b = x;
    }
    
    Rectangle(double x, double y) {
        a = x;
        b = y;
    }
    
    public void setA(double x) {
        a = x;
    }
    
    public void setB(double x) {
        b = x;
    }
    
    public double getA() {
        return a;
    }
    
    public double getB() {
        return b;
    }
    
    
    public double getSquare() {
        return a * b;
    }
}

public class Pr_12_3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 4);
        r.setA(3);
        System.out.println("a = " + r.getA() + ", b = " + r.getB());
        System.out.println("S = " + r.getSquare());
    }
}
