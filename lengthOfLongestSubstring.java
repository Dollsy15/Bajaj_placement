import java.util.*; 

public class lengthOfLongestSubstring { 
    public static void main(String[] args) {
        lengthOfLongestSubstring solve = new lengthOfLongestSubstring();
        String input = "abcabcbb";
        int result = solve.lengthOfLongestSubstring(input);
        System.out.println("Result: " + result);
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLen = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
