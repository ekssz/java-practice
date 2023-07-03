package practice;

import java.util.*;

public class Pr_8_4 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
			double n;
			
			double[] y = new double[10];
			
			for (int k = 0; k < 10; k++) {
			    System.out.println("vvedit " + (k + 1) + "diisnii element masivu");
			    n = scan.nextDouble();
			    y[k] = n;
			}
			
			double m = y[0];
			
			for (int k = 1; k < y.length; k++) {
			    if (m > 0) {
			        if (y[k] > 0 && y[k] < m)
			            m = y[k];
			    } else {
			        m = y[k];
			    }
			}
			
			if (m > 0)
			    System.out.println("minimalniy dodatnii element masiva = " + m);
			else
			    System.out.println("masiv ne maye dodatnix elementiv"); 
		}
    }
}
