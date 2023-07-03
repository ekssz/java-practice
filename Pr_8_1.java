package practice;

public class Pr_8_1 {
    public static void main(String[] args) {
        double[] a;
        a = new double[]{0.1, 0.2, -0.3, 0.45, -0.02};
        
        double aMin = a[0];
        double aMax = aMin;
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] < aMin)
                aMin = a[i];
            
            if (a[i] > aMax)
                aMax = a[i];
        }
        
        double range = aMax - aMin;
        
        System.out.println("aMin = " + aMin);
        System.out.println("aMax = " + aMax);
        System.out.println("range = " + range);
    }
}
