package Array;

public class bai12 {
    public static void main(String[] args) {
        String[] a=new String[]{"A","B","C"};
        String[] b=new String[5];
        b[3]="D";
        b[4]="E";
        System.arraycopy(a,0,b,0,a.length);
        for(String str:b){
            System.out.println(str);
        }
    }
}
