public class LongestRepeatingCharReplace {
    public static void main(String[] args) {
        System.out.println(LongestRepeatingCharReplacementByK("AABABBA", 1)); // Output: 4
    }

    private static int LongestRepeatingCharReplacementByK(String s, int k) {
        int left = 0, right = 0;
        int maxCount = 0;
        int[] count = new int[26];
        int res = 0;

        while (right < s.length()) {
            int idx = s.charAt(right) - 'A';
            count[idx]++;
            maxCount = Math.max(maxCount, count[idx]);

            // if invalid window, shrink from left
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }

            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }
}
