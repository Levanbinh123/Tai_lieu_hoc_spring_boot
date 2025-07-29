package Array;

import java.util.Arrays;

public class bai1 {
    public static void main(String[] args) {
        int array[]={2,3,4,5,6,1,0};
        Arrays.sort(array);
        printArray("sorted array",array);
        int index=Arrays.binarySearch(array,2);
        System.out.println(index);
    }
    private static void printArray(String message,int[] array){
        System.out.println(message+":[length:"+array.length+"]");
        for(int i=0;i<array.length;i++){
            if(i!=0){
                System.out.print(",");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
}
