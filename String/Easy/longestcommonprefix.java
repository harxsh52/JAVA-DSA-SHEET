package String.Easy;

import java.util.Arrays;

public class longestcommonprefix {
        public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int minLength = Math.min(strs[0].length(), strs[strs.length - 1].length());
       int i = 0;
        while (i < minLength && strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
            i++;
        }
        return strs[0].substring(0, i);
    }
}
