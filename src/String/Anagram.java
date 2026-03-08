package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String str1,String str2) {
        int n = str1.length();
        int m = str2.length();
        if(n != m) return false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }

    // Optimal Solution
    public static boolean check(String str1,String str2) {
        int n = str1.length();
        int m = str2.length();
        if(n != m) return false;
        int[] freq = new int[26];
        for(int i = 0; i < n; i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for(int count : freq) {
            if(count != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter your second string : ");
        String str2 = sc.nextLine();
//        System.out.println(isAnagram(str1,str2));
        System.out.println(check(str1,str2));
    }
}
