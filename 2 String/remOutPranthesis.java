class remOutPranthesis{
    public static void main(String[] args) {
        String s=new String("(()())(())");
        System.out.println(removeOuterParentheses(s));
    }

     public static String removeOuterParentheses(String s) {
        int depth=0;
        StringBuilder res=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(depth>0){
                    res.append(c);
                }
                depth++;
            }else{

                depth--;
                if(depth>0){
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}