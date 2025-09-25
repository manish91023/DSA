
public class noSubStrContainAllChar {
    public static void main(String[] args) {
        System.out.println(numberOfSubstring("aaacb"));
    }
     public static int numberOfSubstring(String s) {
        int n = s.length();
        int[] count = new int[3]; // count of a,b,c
        int left = 0, result = 0;

        for (int right = 0; right < n; right++) {
            count[s.charAt(right) - 'a']++;

            // shrink window until it's invalid
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                result += n - right;  // all substrings from left..right to left..n-1
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return result;
    }
}
