package Date_Time;

import java.util.Calendar;
import java.util.Formatter;

public class bai2 {
    public static void main(String[] args) {
        Formatter fmt=new Formatter();
        Calendar cal=Calendar.getInstance();
        fmt=new Formatter();
        fmt.format("%tB %tb %tm", cal, cal, cal);
        System.out.println(fmt);
    }
}
