package practice;

public class Pr_8_3 {
    public static void main(String[] args) {
       
        long[][] d = new long[10][10];
        
        
        int k, n;
        
        
        for (k = 0; k <= 9; k++) {
            for (n = 0; n <= 9; n++)
                d[k][n] = 0;
        }
        
        int i = (int) (Math.random() * 10);
        int j = (int) (Math.random() * 10);
        
        d[i][j] = 4;
        
        boolean b;
        b = false;
        
        do {

            int napr = (int) (Math.random() * 4);
            
            switch (napr) {
                case 0:
                    if (i >= 3) {
                        b = true;
                        for (k = i - 3; k <= i; k++)
                            d[k][j] = 4;
                        break;
                    }
                case 1:
                    if (j <= 6) {
                        b = true;
                        for (n = j; n <= j + 3; n++)
                            d[i][n] = 4;
                        break;
                    }
                case 2:
                    if (i <= 6) {
                        b = true;
                        for (k = i; k <= i + 3; k++)
                            d[k][j] = 4;
                        break;
                    }
                case 3:
                    if (j >= 3) {
                        b = true;
                        for (n = j - 3; n <= j; n++)
                            d[i][n] = 4;
                        break;
                    }
                default:
                    b = false;
            }
        } while (b == false);
        
        for (k = 1; k <= 10; k++) {
            for (n = 1; n <= 10; n++)
                System.out.print("" + d[k - 1][n - 1] + "\t");
            
            System.out.println("");
        }
    }
}
