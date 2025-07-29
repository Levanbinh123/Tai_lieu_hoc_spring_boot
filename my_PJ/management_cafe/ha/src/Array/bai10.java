package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bai10 {
    public static void main(String[] args) {
        String a[]={"1","2","3"};
        String b[]={"4","5","6"};
        List list=new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] array=list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
