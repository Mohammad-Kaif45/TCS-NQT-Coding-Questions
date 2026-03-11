package Arrays;
import java.util.*;
public class SymmetricPair {

    // Brute Force using two loop
    public static void checkSymmetry(int[][] pairs) {
        for(int i = 0; i < pairs.length; i++) {
            for(int j = i + 1; j < pairs.length; j++) {
                if(pairs[j][0] == pairs[i][1] && pairs[j][1] == pairs[i][0]) {
                    System.out.print("(" + pairs[i][1] + " " + pairs[i][0] + ") ");
                    break;
                }
            }
        }
    }

    public void findSymmetricPairs(int[][] arr) {
        Map<Integer, Integer> mp = new HashMap<>();  // Map to store first element and its pair
        System.out.println("The Symmetric Pairs are:");

        // Loop through the array to find symmetric pairs
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i][0];
            int second = arr[i][1];

            // Check if {second, first} existed previously
            if (mp.containsKey(second) && mp.get(second) == first) {
                System.out.print("(" + first + " " + second + ") ");
            } else {
                // Store {first, second} pair in the map
                mp.put(first, second);
            }
        }
    }
    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};
        checkSymmetry(pairs);
        SymmetricPair obj = new SymmetricPair();
        obj.findSymmetricPairs(pairs);
    }
}
