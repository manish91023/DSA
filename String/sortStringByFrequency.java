import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class sortStringByFrequency {
    public static void main(String[] args) {
       System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        Map<Character,Integer>freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }

    Character[] chars = new Character[s.length()];
    for (int i = 0; i < s.length(); i++) {
        chars[i] = s.charAt(i);
    }

        Arrays.sort(chars,(a,b)->{
            int freqA=freq.get(a);
            int freqB=freq.get(b);


            if(freqA!=freqB){
                return freqB-freqA;
            }else{
                return a-b;
            }

           
        });

        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }

        return sb.toString();
    }
}
