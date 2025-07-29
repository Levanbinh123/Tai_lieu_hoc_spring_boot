package String;

public class bai13 {
    public static void main(String[] args) {
        String variables []=new String[50000];
        for(int i=0;i<50000;i++){
            variables[i]="s"+i;
        }
        long startTime1=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i]="hello";
        }
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
        long startTime2=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i]=new String("hello");
        }
        long endTime2=System.currentTimeMillis();
        System.out.println(endTime2-startTime2);
        long startTime3=System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            variables[i]=new String("hello");
            variables[i]=variables[i].intern();
        }
        long endTime3=System.currentTimeMillis();
        System.out.println(endTime3-startTime3);
    }
}
