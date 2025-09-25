public class reverseWordString {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
    }
    public static String reverseWords(String s) {
        String[] strArr=s.trim().split("\\s+");
        StringBuilder result=new StringBuilder();

        for(int i=strArr.length-1;i>=0;i--){
            result.append(strArr[i]);
            if(i>0){
                result.append(" ");
            }
        }
        return result.toString();
    }
}
