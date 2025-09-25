public class checkStringRotation {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "bcdae"));
    }
     public static boolean rotateString(String s, String goal) {
        int n=goal.length();
        if(n!=s.length()) return false;

        String doubleStringOfS=s+s;
        return doubleStringOfS.contains(goal);
    }
}
