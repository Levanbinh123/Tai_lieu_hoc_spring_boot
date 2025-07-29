package String;

public class bai18 {
    public static void main(String[] args) {
        countTo_N_Improved();
    }
    public final static int MAX_LENGTH = 50;
    private static String buffer="";
    private static void emit(String nextChunk){
        if(buffer.length()+nextChunk.length()>MAX_LENGTH){
            System.out.println(buffer);
            buffer="";

        }
    }
    private static final int N=100;
    private static void countTo_N_Improved(){
        for(int count=2;count<=N;count+=2){
            emit(" "+count );

        }if(!buffer.equals("")){
            System.out.println(buffer);
        }
    }
}
