package String;

public class bai10 {
    public static void main(String[] args) {
        String chuoi1="le van binh";
        String chuoi2="le van binh";
        boolean result=chuoi1.regionMatches(6,chuoi2,6,5);
        System.out.println(result);
    }
}
