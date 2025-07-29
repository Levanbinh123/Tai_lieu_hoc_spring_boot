package String;

public class baitap2 {
    public static void main(String[] args) {
        String chuoi="le van binh";
        int lastIndex=chuoi.lastIndexOf("binh1");
        if(lastIndex==-1){
            System.out.println("not found binh");
        }
        else{
            System.out.println(chuoi.substring(lastIndex));
        }
    }
}
