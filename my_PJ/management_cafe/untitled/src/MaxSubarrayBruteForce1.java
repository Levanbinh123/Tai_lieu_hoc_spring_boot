public class MaxSubarrayBruteForce1 {
    public static int maxSubarrayBruteForce(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int currentSum=0;
            for(int j=i;i<arr.length;j++){
                currentSum+=arr[j];
                max=Math.max(max,currentSum);
            }
        }
        return max;
    }
    public static int dayConLienTucDaiNhat(int [] arr){
        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int count=0;

            for(int j=i;i<arr.length;j++){
                if(arr[j]<arr[j+1]){
                    break;
                }
                count++;

            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
    public static int findLongestNonDecreasingSubarray(int[] arr){
        if(arr.length==0) return 0;
        int max=1;
        int currentLen=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                currentLen++;
                max=Math.max(max,currentLen);
            }
            else{
                currentLen=1;
            }
            for(int j=i;j<arr.length;j++){}
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result=dayConLienTucDaiNhat(arr);
        System.out.println(result);
    }
}
