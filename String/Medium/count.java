package String.Medium;
    import java.util.*;
public class count {


    public static int countSubstring(String s) {
        return countAtMostK(s, 3) - countAtMostK(s, 2);
    }

    private static int countAtMostK(String s, int k) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char charRight = s.charAt(right);
            map.put(charRight, map.getOrDefault(charRight, 0) + 1);

            while (map.size() > k) {
                char charLeft = s.charAt(left);
                map.put(charLeft, map.get(charLeft) - 1);
                if (map.get(charLeft) == 0) {
                    map.remove(charLeft);
                }
                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }
}

