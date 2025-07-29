package String;


public class buffer {
    public static final int MAX_LENGTH = 30;
    public static String buffer="";
    public static void main(String[] args) {
        String text = "Chào mừng bạn đến với thế giới lập trình Java. Hãy cùng nhau học cách xử lý chuỗi dài!";
        for(String word:text.split(" ")){
            emit(" "+word);
        }
        if(!buffer.isEmpty()){
            System.out.println(buffer);
        }
    }
    public static void emit(String nextChunk){
        if(buffer.length()+nextChunk.length()>MAX_LENGTH){
            System.out.println(buffer);
            buffer="";
        }
        buffer+=nextChunk;
    }
}
