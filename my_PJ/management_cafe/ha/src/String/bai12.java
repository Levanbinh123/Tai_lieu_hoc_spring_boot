package String;

public class bai12 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            String s1="abc";
            String s2="abc";
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        //
        long startTime1=System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            String s3=new String("abc");
            String s4=new String("abc");
        }
        long endTime1=System.currentTimeMillis();
        System.out.println(endTime1-startTime1);
    }
}
