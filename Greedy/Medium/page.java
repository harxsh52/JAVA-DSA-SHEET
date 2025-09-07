package Greedy.Medium;

import java.util.ArrayList;

public class page {
    static int pageFaults(int N, int C, int pages[]) {
        // code here
        int count = 0;
        ArrayList<Integer> v = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int index = v.indexOf(pages[i]);

            if (index == -1) {
                if (v.size() == C) {
                    v.remove(0);
                }
                v.add(pages[i]);
                count++;
            }
            else {

                v.remove(index);
                v.add(pages[i]);
            }
        }
        return count;
    }
}
