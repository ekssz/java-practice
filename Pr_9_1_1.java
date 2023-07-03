package practice;

public class Pr_9_1_1 {
    public static void main(String[] args) {
        String str = "1 000 000 000";

        char[] chArray = str.toCharArray();
        

        for (int i = 0; i < chArray.length; i++) {

            if (chArray[i] == ' ') {

                chArray[i] = '.';
            }
        }
        

        System.out.println(chArray);
    }
}
