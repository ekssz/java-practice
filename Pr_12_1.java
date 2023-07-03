package practice;

class DemoAccess {
    public static final double C = 8.05; 
    private int x; 
    double y; 
    public int z; 

    DemoAccess() {
        x = 1;
        y = 1;
        z = 1;
    } 

    public void setX(int in) {
        x = in;
    } 

    public int getX() {
        return x;
    } 

    private double getExpr() { 
        return (x * x + y * y) / 2;
    }

    public double getFunction(double in) {
        return in * Math.sqrt(getExpr()); 
    }
}

public class Pr_12_1 {
    public static void main(String[] args) {
        double h = 100 * DemoAccess.C; 
        DemoAccess demo = new DemoAccess();
        double a = 2.4 * demo.y + 3.5; 
        System.out.println("a = " + a);

        demo.setX(-7);
        int b = 2 * demo.getX() + 20;
        System.out.println("b = " + b);

        demo.z += 12.55; 
        b = 2 * demo.z;
        System.out.println("b = " + b);

        System.out.println(demo.getFunction(2 * h));
    }
}
