import java.util.*;
public class MinimumCost {
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int min_cost = 0;
        for(int i = n - 1; i >= 0; i--) {
            if((n-i) % 3 != 0) {
                min_cost += cost[i];
            }
        }
        return min_cost; // return
    }

    public static void main(String[] args) {
        int[] cost = {6,5,7,9,2,2};
        int ans = minimumCost(cost);
        System.out.println("Total minimum cost is =  " + ans);
    }
}
