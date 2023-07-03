package practice;

public class Pr_9_4 {
    public static void main(String[] args) {

        String[] porty = {"Herson", "Zaporizhia", "Dnipro", "Nikopol", "Mikolaiv", "Kiuv"};


        String result = "Osnovni richkovi portu Ukrainu znahodiatsa v mistax: ";


        for (int i = 0; i < porty.length; i++) {
 
            if (i != porty.length - 1)
                result += porty[i] + ", ";

            else
                result += porty[i] + ".";
        }

        System.out.println(result);
    }
}
