public class selectionsort {
public static void main(String[] args) {
    int array[]={23,2,3,5,1,8};
    selectionsortt(array);
    for(int i:array){
        System.out.println(i);
    }

}
private static void selectionsortt(int [] array) {

    for(int i=0;i<array.length-1;i++) {
        int min=i;
        for(int j=i+1;j<array.length;j++) {
 if(array[j]<array[min]) {
     min=j;
 }
        }
        int temp=array[i];
        array[i]=array[min];
        array[min]=temp;


    }
}
}
