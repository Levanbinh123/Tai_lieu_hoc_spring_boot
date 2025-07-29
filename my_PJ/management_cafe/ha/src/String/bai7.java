package String;

public class bai7 {
    public static void main(String[] args) {
        String chuoi="le van binh";
        String[] temp;
        String delimeter=" ";
        temp=chuoi.split(delimeter);
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
            System.out.println("");
            temp=chuoi.split(delimeter,chuoi.length());

        }
    }
}
