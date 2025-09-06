package String.hard;

public class shortestplaindrome {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        int count = kmp(new StringBuilder(s).reverse().toString(), s);
        String tail = s.substring(count);
        return new StringBuilder(tail).reverse().toString() + s;
    }
    public int kmp(String txt, String patt) {
        String newString = patt + '#' + txt;
        int n = newString.length();
        int[] lps = new int[n];
        int len = 0;
        for (int i = 1; i < n; ) {
            if (newString.charAt(i) == newString.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps[n - 1];
    }
}
