public class maxNestingDepthOfPranthesis {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8/4))"));
    }

     public static int maxDepth(String s) {
        int maxDepth=0;
        int depth=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                depth++;
            }else if(c==')'){
                depth--;
            }
            maxDepth=Math.max(depth,maxDepth);
        }
        return maxDepth;
    }
}
