package Array;

import java.util.Arrays;

public class bai2 {
    public static void main(String[] args) {
            int array[]={2,3,5,1,0};
            Arrays.sort(array);
            printArray("sorted array",array);
            int index=Arrays.binarySearch(array,1);
            System.out.println(index);

    }
    private static void printArray(String message, int[] array) {
        System.out.println(message
                + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0){
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static int[] insertElement(int original[],int element,int index) {
        int length=original.length;
        int detination[]=new int[length+1];
        System.arraycopy(original,0,detination,0,length);
        detination[index]=element;
        System.arraycopy(original,length,detination,length+1,original.length-length);
        return detination;
    }
}
