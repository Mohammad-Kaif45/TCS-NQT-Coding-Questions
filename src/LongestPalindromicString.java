import java.util.Stack;

public class LongestPalindromicString {

    // longest palindromic string
    public static String longestPalindrom(String s){
        String ans ="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPalindrom(s,i,j)){
                    if(j-i+1>ans.length()){
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }
    // function to check palindrom
    public static boolean isPalindrom(String s,int left,int right){
        while (left<right){
            if(s.charAt(left) !=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "babad"; // string input
        System.out.println(longestPalindrom(s));
    }
}
