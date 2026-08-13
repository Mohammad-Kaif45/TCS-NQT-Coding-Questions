public class KadanesAlgorithm {
    public static int maxSubArray(int[] nums){
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int sum=0;
        for(int num:nums){
            sum+=num;
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        int ans=maxSubArray(nums);
        System.out.println(ans);
    }
}
