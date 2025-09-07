package Greedy.Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class fractionalknapsack {
    class pair implements Comparable<pair> {
        int v;      
        int w;
        double r;   

        pair(int v, int w) {
            this.v = v;
            this.w = w;
            this.r = (double) v / w; 
        }

        @Override
        public int compareTo(pair other) {
            return Double.compare(other.r, this.r);
        }
    }

    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        List<pair> items = new ArrayList<>();
        for (int i = 0; i < val.length; i++) {
            items.add(new pair(val[i], wt[i]));
        }
        Collections.sort(items);

        double totalValue = 0.0;

        for (pair item : items) {
            if (capacity >= item.w) {
                totalValue += item.v;
                capacity -= item.w;
            } else {
                totalValue += (item.r * capacity);
                
                break; 
            }
        }
        
        return totalValue;
    }
}
