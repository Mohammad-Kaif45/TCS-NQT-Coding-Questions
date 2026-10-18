public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int n=nums.length;
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<n;i++){
            int rightSum=totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int ans = pivotIndex(nums);
        System.out.println("Pivot Index is :" + ans);
    }
}
