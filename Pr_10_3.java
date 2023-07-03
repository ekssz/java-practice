package practice;

class Segment {
    double length;

    Segment() {
        length = 0;
    }

    Segment(double x) {
        length = x;
    }
}

class Square extends Segment {
    Square() {
        length = 0;
    }

    Square(double x) {
        length = x;
    }

    double getSquare() {
        return length * length;
    }

    double getPerimeter() {
        return 4 * length;
    }
}

public class Pr_10_3 {
    public static void main(String[] args) {
        double s, p; 
        Square s1 = new Square(2);
        s = s1.getSquare();
        p = s1.getPerimeter();
        System.out.println("storona kvadrata: " + s1.length);
        System.out.println("plosha kvadrata: " + s);
        System.out.println("perimetr kvadrata: " + p);
    }
}
