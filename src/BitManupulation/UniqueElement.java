package BitManupulation;

public class UniqueElement {

    public static int usingXor(int[] arr){
        int ans = 0;
        for(int num : arr){
            ans =  ans ^ num;
        }
        return ans;
    }
    public static int findUniqueBrute(int[] arr) {

        for (int j : arr) {

            int count = 0;

            for (int k : arr) {
                if (j == k) {
                    count++;
                }
            }

            if (count == 1) {
                return j;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 3, 2};

        System.out.println(findUniqueBrute(arr));
        System.out.println(usingXor(arr));
    }
}
