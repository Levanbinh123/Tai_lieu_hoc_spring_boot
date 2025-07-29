package String;

import java.util.Locale;

public class baitap14 {
    public static void main(String[] args) {
        double e=Math.E;
        System.out.println(e);
        System.out.format("%f%n",e);
        System.out.format(Locale.CHINESE,"%-10.4f%n",e);
    }
}
