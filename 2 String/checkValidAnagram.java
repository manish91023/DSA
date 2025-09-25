public class checkValidAnagram {
    public static  void main(String[] args) {
        System.out.println(isAnagram("ram", "car"));
    }

     public static  boolean isAnagram(String s, String t) {
         if (s.length() != t.length()) {
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] freqArray = new int[26];

        for (char c : s.toCharArray()) {
            freqArray[c - 'a']++;   
        }
        for (char c : t.toCharArray()) {
            freqArray[c - 'a']--;  
        }

        for (int freq : freqArray) {
            if (freq != 0) return false;
        }

        return true;

    }
}
