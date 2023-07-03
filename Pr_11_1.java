package practice;

class Balance {
    double sum_uah; 
    static double curex = 25.56; 

    Balance(double h) { 
        sum_uah = h;
    }

    double getUah() { 
        return sum_uah;
    }

    double getEur() { 
        return sum_uah / curex;
    }
}

class Pr_11_1 {
    public static void main(String[] args) {

        Balance b1 = new Balance(1000);
        Balance b2 = new Balance(2000);


        System.out.println("aktualnii kurs EUR: " + Balance.curex);
        System.out.println(b1.getUah() + " UAH =" + b1.getEur() + " EUR");
        System.out.println(b2.getUah() + " UAH =" + b2.getEur() + " EUR");

        Balance.curex = 25.60;


        System.out.println("zminenii kurs EUR: " + Balance.curex);
        System.out.println(b1.getUah() + " UAH =" + b1.getEur() + " EUR");
        System.out.println(b2.getUah() + " UAH =" + b2.getEur() + " EUR");
    }
}
