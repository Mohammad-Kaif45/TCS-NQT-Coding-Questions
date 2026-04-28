package Arrays;

public class TrapedRainWater {
    public static int trapedWater(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftmax = 0;
        int rightmax = 0;
        int trapedwater = 0;

        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftmax) {
                    leftmax = height[left];
                } else {
                    trapedwater += leftmax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightmax) {
                    rightmax = height[right];
                } else {
                    trapedwater += rightmax - height[right];
                }
                right--;
            }
        }
        return trapedwater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trapedWater(height);
        System.out.println(result);
    }
}
