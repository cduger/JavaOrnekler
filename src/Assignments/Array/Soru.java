package Assignments.Array;

public class Soru {
    public static void main(String[] args) {
        // bir döngü ile 5 tane buldurunuz
        // fakat bir buldunu tekrar bulmasın

        String nv = "";
        int a;
        String str[] = {"fox", "kanald", "star", "cine5", "show"};
        for (int i = 0; i < str.length; i++) {
            a = (int) (5 * Math.random());
            if (i == 0) {
                nv = str[a];
            } else if (!nv.contains(str[a])) {
                nv = nv + " " + str[a];
            }
        }
        System.out.println(nv);

    }
}
