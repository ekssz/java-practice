package practice;

class Segment {
    private double length;

    Segment() {
        length = 0;
    }

    Segment(double x) {
        length = x;
    }

    double getLength() {
        return length;
    }
}

class Square extends Segment {
    Square() {
        super();
    }

    Square(double x) {
        super(x);
    }

    double getSquare() {
        return getLength() * getLength();
    }

    double getPerimeter() {
        return 4 * getLength();
    }
}

class Cube extends Square {
    Cube() {
        super();
    }

    Cube(double x) {
        super(x);
    }

    @Override
    double getSquare() {
        return 6 * getLength() * getLength();
    }

    double getVolume() {
        return getLength() * getLength() * getLength();
    }
}

public class Pr_10_4 {
    public static void main(String[] args) {
        Segment seg = new Segment(5);
        Square sqr1 = new Square();
        Square sqr2 = new Square(3);
        Cube cb = new Cube(4);

        System.out.println("dovjina vidrizka: " + seg.getLength());
        System.out.println("storona 1 kvadrata: " + sqr1.getLength());
        System.out.println("storona 2 kvadrata: " + sqr2.getLength());
        System.out.println("rebro kyba: " + cb.getLength());
        System.out.println("plosha 1 kvadrata: " + sqr1.getSquare());
        System.out.println("perimetr 2 kvadrata: " + sqr2.getPerimeter());
        System.out.println("plosha poverni kyba: " + cb.getSquare());
        System.out.println("obiem kyba: " + cb.getVolume());
    }
}
