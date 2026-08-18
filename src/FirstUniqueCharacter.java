public class FirstUniqueCharacter {
    public static int unique(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<n;i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(unique(s));
    }
}
