package practice;

public class Pr_8_2 {
    public static void main(String[] args) {
        int[][] d = new int[3][4];
        d[0][0] = 1; d[0][1] = 2; d[0][2] = 3; d[0][3] = 4;
        d[1][0] = 5; d[1][1] = 6; d[1][2] = 7; d[1][3] = 8;
        d[2][0] = 9; d[2][1] = 10; d[2][2] = 11; d[2][3] = 12;
        
        int k, n;
        for (k = 0; k <= 2; k++) {
            for (n = 0; n <= 3; n++)
                System.out.print("" + d[k][n] + "\t");
            
            System.out.println("");
        }
        
        int dMin = d[0][0];
        int dMax = dMin;
        
        for (k = 0; k <= 2; k++) {
            for (n = 0; n <= 3; n++) {
                if (d[k][n] < dMin)
                    dMin = d[k][n];
                
                if (d[k][n] > dMax)
                    dMax = d[k][n];
            }
        }
        
        double range = dMax - dMin;
        
        System.out.println("dMin = " + dMin);
        System.out.println("dMax = " + dMax);
        System.out.println("range = " + range);
    }
}
