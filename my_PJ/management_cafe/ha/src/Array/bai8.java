package Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class bai8 {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9};
        int min=(int) Collections.min(Arrays.asList(array));
        int max=(int) Collections.max(Arrays.asList(array));
        System.out.println(Arrays.toString(array));
        System.out.println(min);
        System.out.println(max);
    }
}
