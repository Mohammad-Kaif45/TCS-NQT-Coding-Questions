import java.util.Arrays;

public class ProductExceptItSelf {
    public static int[] product(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = leftProduct;
            leftProduct *= nums[i];
        }
        int rightProduct = 1;
        for(int i=n-1;i>=0;i--){
            ans[i] *=rightProduct;
            rightProduct*=nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(product(nums)));
    }
}
