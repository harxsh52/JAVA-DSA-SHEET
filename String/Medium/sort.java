package String.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class sort {
    public String frequencySort(String s) {
        HashMap <Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            for(int i=0; i<entry.getValue(); i++){
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
    public String frequencySosrt(String s) {
        Set<Character> set=new HashSet<>();
        int[] v=new int[256];
        List<Character> list=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(!set.contains(ch)){
                list.add(ch);
                set.add(ch);
            }
            v[ch]++;
        }
        Collections.sort(list);
        Collections.sort(list,(a,b)->v[b]-v[a]);
        StringBuilder sb=new StringBuilder();
        for(char ch:list){
            for(int i=0;i<v[ch];i++){
                sb.append(ch);
            }
        }
        return sb.toString();

    }

}
