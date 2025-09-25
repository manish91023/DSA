public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("words and 987"));
    }

     public static int myAtoi(String s) {
       if (s == null || s.length() == 0) return 0;

        int i = 0, n = s.length();
        // Step 1: Skip whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Step 2: Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Step 3: Convert digits
        long num = 0; // use long to detect overflow
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            // Step 4: Clamp overflow
            if (sign == 1 && num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -num < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }

        return (int) (sign * num);
    }
}
