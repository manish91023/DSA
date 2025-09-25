import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        System.out.println(uniqueLongestSubstringLength("abba"));
    }

    private static int uniqueLongestSubstringLength(String str){
        int left=0;
        int maxLen=0;
        Map<Character,Integer>map=new HashMap<>();
        for(int right=0;right<str.length();right++){
            char c=str.charAt(right);

            if(map.containsKey(c) && map.get(c)>=left){
                left=map.get(c)+1;
            }

            map.put(c, right);
            int len=(right-left)+1;
            maxLen=Math.max(maxLen, len);
        }
        return maxLen;
    }
}
