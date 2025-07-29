package String;

public class bai15 {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String result = "This is"
                    + "testing the"
                    + "difference"+ "between"
                    + "String"+ "and"+ "StringBuffer";
        }
        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);
        long startTime2=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            StringBuffer result = new StringBuffer();
            result.append("This is");
            result.append("testing the");
            result.append("difference");
            result.append("between");
            result.append("String");
            result.append("and");
            result.append("StringBuffer");
        }
        long endTime2=System.currentTimeMillis();
        System.out.println(endTime2-startTime2);
    }
}
