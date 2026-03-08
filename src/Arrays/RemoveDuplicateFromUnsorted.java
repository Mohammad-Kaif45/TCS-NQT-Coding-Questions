package Arrays;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicateFromUnsorted {
    public static void remove(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        for(int num : set) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements of an array : ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        remove(nums);
    }
}
