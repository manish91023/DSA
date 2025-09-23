import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("XIV"));
    }

    public static int romanToInt(String s) {
        Map<Character,Integer>romanValue=new HashMap<>();

        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);
        int result=0;
       for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int value=romanValue.get(c);
            if(i+1<s.length() && value<romanValue.get(s.charAt(i+1))){
                result-=value;
            }else{
                result+=value;
            }
       }
       return result;
    }
}
