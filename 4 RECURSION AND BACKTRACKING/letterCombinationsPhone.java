import java.util.ArrayList;
import java.util.List;

public class letterCombinationsPhone {
    private static final String[] KEYS = {
        "",    // 0
        "",    // 1
        "abc", // 2
        "def", // 3
        "ghi", // 4
        "jkl", // 5
        "mno", // 6
        "pqrs",// 7
        "tuv", // 8
        "wxyz" // 9
    };
    public static void main(String[] args) {
        List<String>result=new ArrayList<>();
        backtrack("78", 0, result, new StringBuilder());
        System.out.println(result);
    }
    private static void backtrack(String digits,int start,List<String>result,StringBuilder current){
        if(start==digits.length()){
            result.add(current.toString());
            return;
        }

        String letters=KEYS[digits.charAt(start)-'0'];
        for(char c : letters.toCharArray()){
            current.append(c);
            backtrack(digits,start+1,result,current);
            current.deleteCharAt(current.length() - 1);
        }
    }
} 
    

