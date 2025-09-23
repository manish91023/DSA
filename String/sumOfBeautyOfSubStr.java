public class sumOfBeautyOfSubStr {
    public static void main(String[] args) {
        System.out.println(SumOfBeautyOfAllSubString("aabcb")); // expected output
    }

    public static int SumOfBeautyOfAllSubString(String str) {
        int total = 0;
        int length = str.length();

        for (int i = 0; i < length; i++) {
            int[] freq = new int[26]; // frequency array

            for (int j = i; j < length; j++) {
                // update frequency of current character
                freq[str.charAt(j) - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // find max and min freq in current substring
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                total += (maxFreq - minFreq);
            }
        }
        return total;
    }
}
