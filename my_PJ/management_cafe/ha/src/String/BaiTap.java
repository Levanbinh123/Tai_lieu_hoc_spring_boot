package String;

public class BaiTap {
    public static void main(String[] args) {
        String str="le van binh";
        String str1="Le van binh";
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareToIgnoreCase(str1));
    }
}
