package practice;

class Box {
double w, h, d;
void setWidth(double x) { w = x; } // нетипізований
void setHeight(double x) { h = x; } // нетипізований
void setDepth(double x) { d = x; } // нетипізований
double getWidth() { return w; } // типізований
double getHeight() { return h; } // типізований
double getDepth() { return d; } // типізований
double getVolume() { return w*h*d;} // типізований
}
class Pr_10_1{
public static void main(String [ ] args){
Box mybox = new Box();

mybox.setWidth(5);
mybox.setHeight(4);
mybox. setDepth( 1);
System.out.println("shirina bruska: " + mybox.getHeight());
}
}