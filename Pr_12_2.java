package practice;

class Pr_12_2 {
    static int x = 9, y; 

    static { 
        x = 99; 
    }

    int a = 1, p; 
 

    { 
        p = 999; 
    }

    static void f(int b) { 
        int c = 0; 

        { 
            int x = 333; 
            System.out.println("x = " + x); 
        }

        for (int d = 0; d < 10; d++) {

            int a = 4; 
            int e = 5; 
            e++; 
            System.out.println("e = " + e); 
        }

    }

    public static void main(String[] args) {
        int a = 9999; 
        System.out.println("a = " + a); 
        f(a);
    }
}
