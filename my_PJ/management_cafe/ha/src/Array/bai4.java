package Array;

import java.util.Arrays;

public class bai4 {
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
    public static void main(String[] args) {
        int array[]={2,3,23,2,3,1,0};
        Arrays.sort(array);
        printArray("sorted array",array);
        int index=Arrays.binarySearch(array,1);
        System.out.println(index);
        int newIndex=-index-1;
        array=insertElement(array,1,newIndex);
        printArray("sorted array",array);
    }
    public static int[] insertElement(int[] original, int element,int index) {
        int length=original.length;
        int destination[]=new int[length+1];
        System.arraycopy(original,0,destination,0,index);
        destination[index]=element;
        System.arraycopy(original,index+1,destination,index,length-index);
        return destination;
    }
}
