public class Anagram {
    public static boolean isAnagram(String s, String t) {
        // first check both string length is same or not
        if (s.length() != t.length()) {
            return false;
        }
        // frequency array
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
        public static void main(String[] args) {
            String s = "anagram";
            String t = "nagaram";
            System.out.println(isAnagram(s,t));
        }
}
