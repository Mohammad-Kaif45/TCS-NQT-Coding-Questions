public class Reverse {
    public static boolean reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
        return false;
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        System.out.println(reverseString(s));
    }
}
