package Array;

import java.util.ArrayList;

public class Bai13 {
   public static void main(String[] args) {
       ArrayList objArray = new ArrayList();
       objArray.clear();
       objArray.add(0,"0th element");
       objArray.add(1,"1st element");
       objArray.add(2,"2nd element");
       System.out.println("Array before removing an element"+objArray);
       objArray.remove(2);
       objArray.remove("1st element");
       System.out.println("Array after removing an element"+objArray);
   }

}
