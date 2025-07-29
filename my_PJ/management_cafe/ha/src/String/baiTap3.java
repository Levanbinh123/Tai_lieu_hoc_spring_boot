package String;

public class baiTap3 {
    public static void main(String[] args) {
        String chuoi="levan binh";
        //System.out.println(removeCharAt(chuoi,3));
        System.out.println(chuoi.substring(0,4));
    }
    public static String removeCharAt(String str,int index){
        return str.substring(0,index)+str.substring(index+1);
    }
}
