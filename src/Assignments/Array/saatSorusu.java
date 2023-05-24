package Assignments.Array;

public class saatSorusu {
    public static void main(String args[]) {
        int m1 = 1020;
        int m2 = 1000;
        int m3 = 1035;
        int count = 0;

        while (!(m1 == m2 && m2 == m3)){
            count = count + 1;
            m1 = m1 + 1;
            if (m1 == 1440)
                m1 = 0;

            m2 = m2 + 1;
            if (count % 60 == 0)
                m2 = m2 - 20;
            else if(m2 -1440>= 0)
                m2 = m2-1440;

            m3 = m3 + 1;
            if (count % 60 == 0)
                m3 = m3 + 15;
            else if (m3 -1440>= 0)
                m3 = m3-1440;
        }
        System.out.println(m1+" "+m2+" "+m3);
        System.out.println((count / 60 + 1) + " Saat ve " + (count % 60) + " dakika sonra saatler eşitlenmiştir.");
    }
}
