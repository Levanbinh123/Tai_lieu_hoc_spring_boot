package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Bai6 {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }
}
